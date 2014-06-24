package com.cardgame;

public interface DealListener {
	String DECK_EMPTY = "Deck is empty";
	public void getCard(CardViewer deltCard);
	public void dealFailed();

}
