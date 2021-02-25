import { Pipe, PipeTransform } from "@angular/core";

@Pipe({name:"punctuation"})
export class PunctuationPipe implements PipeTransform{
    transform(value: any, ...args: any[]) {
        let cardContent:string = value;
        if(!cardContent.endsWith(".") && !cardContent.endsWith("!") && !cardContent.endsWith("?")){
            value = cardContent.concat(".");
        }

        return value;
    }

}