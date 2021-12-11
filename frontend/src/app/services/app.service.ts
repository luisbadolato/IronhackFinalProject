import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { LessonDataDto } from '../models/lesson-data-dto';

@Injectable({
  providedIn: 'root'
})
export class AppService {
  // DIRECT LINK TO SERVICES
  // arpegiosURL = 'http://localhost:8083/';
  // chordsURL = 'http://localhost:8082/';
  // scalesURL = 'http://localhost:8081/';
  // theoryURL = 'http://localhost:8084/';

  // PETITIONS THROUGH EDGE AUTH SERVICE
  baseURL = 'http://localhost:8080';


  constructor(private http: HttpClient) {  }

  public getArpeggioSubjects(): Observable<any> {
    return this.http.get<any>(this.baseURL + '/arpeggios/subjects');
  }
  public getArpegioLesson(id: number): Observable<any> {
    return this.http.get<any>(this.baseURL + `/arpeggios/lessons/${id}`);
  }
  public getChordsSubjects(): Observable<any> {
    return this.http.get<any>(this.baseURL + '/chords/subjects');
  }
  public getChordsLesson(id: number): Observable<any> {
    return this.http.get<any>(this.baseURL + `/chords/lessons/${id}`);
  }
  public getScaleSubjects(): Observable<any> {
    return this.http.get<any>(this.baseURL + '/scales/subjects');
  }
  public getScaleLesson(id: number): Observable<any> {
    return this.http.get<any>(this.baseURL + `/scales/lessons/${id}`);
  }
  public getTheorySubjects(): Observable<any> {
    return this.http.get<any>(this.baseURL + '/theory/subjects');
  }
  public getTheoryLesson(id: number): Observable<any> {
    return this.http.get<any>(this.baseURL + `/theory/lessons/${id}`);
  }
  public getUser(username: string): Observable<any> {
    return this.http.get<any>(this.baseURL + `/users/name/${username}`);
  }
  public deleteUser(username: string): Observable<any> {
    return this.http.delete<any>(this.baseURL + `/users/name/${username}`);
  }
  public getDiscreetLessonData(username:string, lessonId: number, moduleName: string): Observable<any> {
    return this.http.get<any>(this.baseURL + `/data/${username}/${moduleName}/${lessonId}`);
  }
  public updateLessonData(id: number, data: LessonDataDto): Observable<any> {
    return this.http.put<any>(this.baseURL + `/data/update/${id}`, data);
  }
  public getModuleMastery(userName: string, moduleName: string): Observable<any> {
    return this.http.get<any>(this.baseURL + `/total/${userName}/${moduleName}`);
  }
}
