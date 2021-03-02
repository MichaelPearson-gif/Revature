import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Card } from 'src/app/models/card';

@Component({
  selector: 'app-card-details',
  templateUrl: './card-details.component.html',
  styleUrls: ['./card-details.component.css']
})
export class CardDetailsComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  // CardDetailsComponenet is being used as achild component of the CardComponent. 
  // That said, the CardComponent has access to all of the cards that have been pulled from our web service - 
  // BUT our child componenet does not. We need, at the very least, for each instance of the CardDetailsComponent
  // class to have access to one card so that it can display data related to that card.
  // As such, we want to pass information from the parent component to the child component.
  // We can do so using the @Input decorator

  @Input() card:Card;

  updatedCard:Card = new Card(0, 'n/a', false);

  // In order to move our state from our child component to our parent component, We will create an EventEmitter.
  // An event emitter can be used as an event in our template.
  // Note that your emitter will literally "emit" a value that can then be used by the parent component.
  @Output() updatedCardEvent = new EventEmitter<Card>();

  // I want to update a card's state, but in doing so, that updated state won't automatically be sent to the parent component.
  // As such, I want to create an event which will handle updating the child's state.

  updateCardState(): void{
    // Copy over the old card's state that I don't intend on changing
    this.updatedCard.id = this.card.id;
    this.updatedCard.cardStatus = this.card.cardStatus;
    this.updatedCardEvent.emit(this.updatedCard);
  }

}
