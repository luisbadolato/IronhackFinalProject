import { Component, OnInit } from '@angular/core';
import { LessonDataDto } from 'src/app/models/lesson-data-dto';
import { AppService } from 'src/app/services/app.service';
import { TokenService } from 'src/app/services/token.service';

@Component({
  selector: 'app-arpegio-module',
  templateUrl: './arpegio-module.component.html',
  styleUrls: ['./arpegio-module.component.scss']
})
export class ArpegioModuleComponent implements OnInit {

  masteryIconArray: string[] = [
    "../../../assets/svg/check-empty.svg",
    "../../../assets/svg/check-red.svg",
    "../../../assets/svg/check-yellow.svg",
    "../../../assets/svg/check-green.svg",
    "../../../assets/svg/check-blue.svg"
  ];
  masteryValues = [
    {id: 0, name: "Select Mastery Level"},
    {id: 1, name: "Red: Novice"},
    {id: 2, name: "Yellow: Competent"},
    {id: 3, name: "Green: Experienced"},
    {id: 4, name: "Blue: Master"}
  ];
  userMastery: Array<{lessonId: number, mastery: string}> = [];
  masterySelectedValue!: number;

  isLogged: boolean = false;
  userName: string = "";
  userId: number = 0;
  userImage: string = "";
  breadcrumbs: string = "";
  data: any;
  value: number = 0;
  subjectName: string = "";
  sectionName: string = "";
  unitName: string = "";

  postTitle: string = "";
  postBody: string = "";

  lessonIndex: number = -1;
  lessonId!: number;
  lessonTitle: string = "";
  lessonText: string = "";
  lessonImage: string = "";
  lessonAdvice: string = "";
  lessonAudioSlow: string = "";
  lessonAudioFast: string = "";
  lessonUnitId!: number;

  lessonAnnotation!: string;

  moduleName: string = "";

  constructor(
    private appService: AppService,
    private tokenService: TokenService
  ) { }

  ngOnInit(): void {
    this.masterySelectedValue = 0;
    this.loadSubjects();
  }

  loadMastery(userName: string, moduleName: string) {
    this.appService.getModuleMastery(userName, moduleName).subscribe(
      data => {
        data.array.forEach((element: any) => {
          this.userMastery.push({
            "lessonId": element.id,
            "mastery": element.mastery
          })
        });
        console.log(this.userMastery);
      }
    );
  }

  loadSubjects(): void {
    this.appService.getArpeggioSubjects().subscribe(
      data => {
        data.forEach((element: { subjectName: any; }) => {
          console.log(data);
        });
        this.data = data;
        this.moduleName = data[0].moduleName;
        this.isLogged = true;
      }
    );
    this.loadUserData();
  }

  loadUserData(): void {
    if (this.tokenService.getUserName()) {
      this.userName = this.tokenService.getUserName()!;
      this.userImage = "../../../assets/images/user-random.png";
      console.log("MODULE_NAME " + this.moduleName);
    }
  }

  subjectClicked(subject: string): void {
    this.subjectName = subject;
    this.setBreadcrumbs();
  }

  sectionClicked(section: string): void {
    this.sectionName = section;
    this.setBreadcrumbs();
  }

  unitClicked(unit: string): void {
    this.unitName = unit;
    this.setBreadcrumbs();
  }

  postClicked(post: any): void {
    this.postTitle = post.postTitle;
    this.postBody = post.postBody;
  }

  setBreadcrumbs(): void {
    this.breadcrumbs = `${this.subjectName} \\ ${this.sectionName} \\ ${this.unitName} \\ `;
  }

  logout() {
    window.sessionStorage.clear();
    window.location.reload();
  }

  lessonClicked(id: number, lessonIndex: number) {
    this.setBreadcrumbs();
    this.lessonIndex = lessonIndex + 1;
    this.loadLesson(id);
    this.appService.getArpeggioSubjects().subscribe(
      data => {
        this.moduleName = data[0].moduleName;
        this.loadUserLessonData(id, data[0].moduleName);
      }
    );
  }

  loadLesson(id: number) {
    this.appService.getArpegioLesson(id).subscribe(
      data => {
        this.lessonId = data.id;
        this.lessonTitle = data.lessonTitle;
        this.lessonText = data.textBody;
        this.lessonImage= data.imageUrl;
        this.lessonAdvice = data.adviceText;
        this.lessonAudioSlow = data.audioSlowUrl;
        this.lessonAudioFast = data.audioFastUrl;
        this.lessonUnitId = data.unit;
      }
    );
  }


  loadUserLessonData(id: number, moduleName: string) {
    if (this.tokenService.getUserName()) {
      this.userName = this.tokenService.getUserName()!;
      this.appService.getDiscreetLessonData(this.userName, id, moduleName).subscribe(
        data => {
          try {
            this.lessonAnnotation = data.annotation;
            this.masterySelectedValue = data.mastery;
          } catch (error) {
            console.log(error)
          }
        }
      );
    }
  }

  saveLessonData(id: number){
    if (this.tokenService.getUserName()) {
      this.userName = this.tokenService.getUserName()!;
      this.appService.getUser(this.userName).subscribe(
        data => {this.userId = data.id;}
      );
      this.appService.getDiscreetLessonData(this.userName, id, this.moduleName).subscribe(
        data => {
          try {
            let updatedData: LessonDataDto = new LessonDataDto(
              data.id, this.masterySelectedValue, data.lessonId, 
              this.lessonAnnotation, this.moduleName, this.userId
            );
            console.log(updatedData)
            this.appService.updateLessonData(data.id, updatedData).subscribe();
          } catch (error) {
            console.log(error)
          }
        }
      );
    }
  }

}
