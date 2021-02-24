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

  cards:Card[] = [this.card1, this.card2, this.card3, this.card4];

}
