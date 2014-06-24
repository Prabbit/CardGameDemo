package com.cardgame;

public class CardPlayer {

	public static void main(String[] args) {
		Deck lDeck = new Deck(mDealListener);

		System.out.println("=======Cards in fresh Deck=======");
		System.out.println();
		lDeck.showCards();

		lDeck.shuffleDeck();
		System.out.println();
		System.out.println("=======Cards in shuffled Deck=======");
		lDeck.showCards();
		
		System.out.println();
		System.out.println("=======Cards Dealt=======");
		lDeck.dealOneCard();

	}

	static DealListener mDealListener = new DealListener() {

		@Override
		public void getCard(CardViewer deltCard) {
			System.out.println(deltCard.toString());
		}

		@Override
		public void dealFailed() {
			System.out.println(DealListener.DECK_EMPTY);
		}
	};

}
