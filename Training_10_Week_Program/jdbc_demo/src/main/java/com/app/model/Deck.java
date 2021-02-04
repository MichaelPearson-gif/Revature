package com.app.model;

public class Deck {

	private int deckId;
	private int playerId;

	public Deck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Deck(int deckId, int playerId) {
		super();
		this.deckId = deckId;
		this.playerId = playerId;
	}

	public int getDeckId() {
		return deckId;
	}

	public void setDeckId(int deckId) {
		this.deckId = deckId;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deckId;
		result = prime * result + playerId;
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
		Deck other = (Deck) obj;
		if (deckId != other.deckId)
			return false;
		if (playerId != other.playerId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Deck [deckId=" + deckId + ", playerId=" + playerId + "]";
	}

}
