export class Lesson {

    id: number;
    title: string;
    text: string;
    imageUrl: string;
    advice: string;
    audioSlowUrl: string;
    audioFastUrl: string;
    unitId: number;
    userText: string;
    userMastery: number;

    constructor(
        id:number, title: string, 
        text: string, imageUrl: string,
        advice: string, audioSlowUrl: string,
        audioFastUrl: string, unitId: number,
        userText: string, userMastery: number
    ) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.imageUrl = imageUrl;
        this.advice = advice;
        this.audioSlowUrl = audioSlowUrl;
        this.audioFastUrl = audioFastUrl;
        this.unitId = unitId;
        this.userText = userText;
        this.userMastery = userMastery;
    }
}
