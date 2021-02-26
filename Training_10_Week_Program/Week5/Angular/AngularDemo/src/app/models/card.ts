export class Card{

    public id:number;
    public name:String;
    public cardStatus:boolean;

    // You must use the constructor keyword to define a constructor.
    // Do not use the class name as that is not correct.
    constructor(id:number, name:String, cardStatus:boolean){
        this.id = id;
        this.name = name;
        this.cardStatus = cardStatus;
    }

    printCardDetails(): void{
        console.log(this.name);
    }

}