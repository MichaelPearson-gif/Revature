import { Component, OnInit } from '@angular/core';
import { Card } from 'src/app/models/card';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  // We will use some simple data binding to facilitate communication between our component and view.
  // A simple means of one-way data binding is "string interpolation".
  // In order to use our interpolation, we'll need some component state.

  card1:Card = new Card(1, "A really strong monster", false);
  card2:Card = new Card(2, "Kind of weak monster but not the weakest", false);
  card3:Card = new Card(3, "Just a monster", true);
  card4:Card = new Card(4, "Not really a monster. Maybe a trap card.", true);
  card5:Card = new Card(5, "Proof of Concept Monster", false);

  cards:Card[] = [this.card1, this.card2, this.card3, this.card4, this.card5];

  // We are going o add a boolean property called "visibility"
  // We'll make it "true" by default.
  visibility:boolean = true;

  // We're adding an event listener that can be invoked when a user clicks on the button in our view
  toggleVisibility(){
    this.visibility = !this.visibility;
  }

  // We will add a property for tracking the preferred name the user enters:
  name:string = "";

  // This property tracks the greeter div's visibility. It has an initial value of "true" so that the greeter div will be
  // visible to the end user for the purpose of putting their name in.

  greeterDiv:boolean = true;

  // This function will update the greeterDiv state after a user clicks on the "Submit Name" button
  submitName(){
    this.greeterDiv = false;
  }

}
