import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LessonDataDto } from 'src/app/models/lesson-data-dto';
import { UserDetailsDto } from 'src/app/models/user-details-dto';
import { AppService } from 'src/app/services/app.service';
import { TokenService } from 'src/app/services/token.service';

@Component({
  selector: 'app-user-page',
  templateUrl: './user-page.component.html',
  styleUrls: ['./user-page.component.scss']
})
export class UserPageComponent implements OnInit {

  modalOpen: boolean = false;
  userName!: string;
  name!: string;
  email!: string;
  user!: UserDetailsDto;
  lessonDataItem!: LessonDataDto;
  lessonData: LessonDataDto[] = [];
  validAnnotations!: number;

  constructor(
    private appService: AppService,
    private tokenService: TokenService,
    private router: Router,
    ) { 
      this.user = new UserDetailsDto(-1, "", "", "", "", []);
    }

  ngOnInit(): void {
    this.loadUser();
    
  }

  loadUser(): void {
    if (this.tokenService.getUserName()) {
      this.userName = this.tokenService.getUserName()!;
      this.appService.getUser(this.userName).subscribe(
        data => {
          console.log(data);
          this.user.id = data.id;
          this.user.nombre = data.nombre;
          this.user.nombreUsuario = data.nombreUsuario;
          this.user.email = data.email;
          data.lessonUserDataList.forEach((item: any) => {
            this.lessonDataItem = new LessonDataDto(
              item.id, item.mastery, item.lessonId, 
              item.annotation, item.moduleName, this.user.id!
            );
            this.lessonData.push(this.lessonDataItem);
            this.validAnnotations = this.lessonData.filter(item => item.annotation?.length! > 0).length;
          })
        }
      );
      
    } 
  }

  askDelete(): void {
    this.modalOpen = true;
  }
  
  confirmDelete(): void {
    this.appService.deleteUser(this.userName).subscribe();
    window.sessionStorage.clear();
    this.modalOpen = false;
    this.router.navigate(['/index']);
  }

  closeModal() {
    this.modalOpen = false;
  }

  logout() {
    window.sessionStorage.clear();
    this.router.navigate(['/index']);
  }

}
