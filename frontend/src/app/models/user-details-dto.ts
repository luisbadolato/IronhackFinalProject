import { LessonDataDto } from "./lesson-data-dto";

export class UserDetailsDto {

    id: number | null;
    nombre: string | null;
    nombreUsuario: string;
    email: string | null;
    password: string | null;
    lessonDataList: LessonDataDto[] = [];
    
    constructor(id: number | null, nombre: string | null, nombreUsuario: string, email: string | null, password: string | null, lessonDataList: LessonDataDto[]) {
        this.id = id;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.lessonDataList = lessonDataList;
    }
}


