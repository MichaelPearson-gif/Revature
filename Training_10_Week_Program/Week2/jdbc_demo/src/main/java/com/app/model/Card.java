package com.app.model;

import java.sql.Date;

public class Card {

	private int cardId;
	private String cardName;
	private int cardType;
	private boolean isFaceUp;
	private Date dateCreated;

	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Card(int cardId, String cardName, int cardType, boolean isFaceUp, Date dateCreated) {
		super();
		this.cardId = cardId;
		this.cardName = cardName;
		this.cardType = cardType;
		this.isFaceUp = isFaceUp;
		this.dateCreated = dateCreated;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public int getCardType() {
		return cardType;
	}

	public void setCardType(int cardType) {
		this.cardType = cardType;
	}

	public boolean isFaceUp() {
		return isFaceUp;
	}

	public void setFaceUp(boolean isFaceUp) {
		this.isFaceUp = isFaceUp;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cardId;
		result = prime * result + ((cardName == null) ? 0 : cardName.hashCode());
		result = prime * result + cardType;
		result = prime * result + ((dateCreated == null) ? 0 : dateCreated.hashCode());
		result = prime * result + (isFaceUp ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (cardId != other.cardId)
			return false;
		if (cardName == null) {
			if (other.cardName != null)
				return false;
		} else if (!cardName.equals(other.cardName))
			return false;
		if (cardType != other.cardType)
			return false;
		if (dateCreated == null) {
			if (other.dateCreated != null)
				return false;
		} else if (!dateCreated.equals(other.dateCreated))
			return false;
		if (isFaceUp != other.isFaceUp)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Card [cardId=" + cardId + ", cardName=" + cardName + ", cardType=" + cardType + ", isFaceUp=" + isFaceUp
				+ ", dateCreated=" + dateCreated + "]";
	}

}
