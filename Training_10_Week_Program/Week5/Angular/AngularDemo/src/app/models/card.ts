export class Card{

    public id:number;
    public name:String;
    public faceUp:boolean;

    // You must use the constructor keyword to define a constructor.
    // Do not use the class name as that is not correct.
    constructor(id:number, name:String, faceUp:boolean){
        this.id = id;
        this.name = name;
        this.faceUp = faceUp;
    }

    printCardDetails(): void{
        console.log(this.name);
    }

}