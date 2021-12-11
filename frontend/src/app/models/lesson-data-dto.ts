export class LessonDataDto {

    id: number | null;
    mastery: number | null;
    lessonId: number | null;
    annotation: string | null;
    moduleName: string | null;
    usuarioId: number | null;

    constructor(id: number, mastery: number, lessonId: number, annotation: string, moduleName: string, usuarioId: number) {
        this.id = id;
        this.mastery = mastery;
        this.lessonId = lessonId;
        this.annotation = annotation;
        this.moduleName = moduleName;
        this.usuarioId = usuarioId;
    }
}
