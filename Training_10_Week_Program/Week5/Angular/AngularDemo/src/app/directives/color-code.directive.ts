import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appColorCode]'
})
export class ColorCodeDirective {

  constructor(private el:ElementRef) { }

  @HostListener('mouseenter') onMouseEnter(){
    if(this.el.nativeElement.innerText === "Face Up: false"){
      this.el.nativeElement.style.color = "Crimson";
    }else{
      this.el.nativeElement.style.color = "ForestGreen";
    }
  }

}
