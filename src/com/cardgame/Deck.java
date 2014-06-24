package com.cardgame;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<CardViewer> mCardList;
	private int mCardIndex;
	private DealListener mDealListener;
	private static final int TOTAL_CARDS=52;

	public Deck( DealListener dealListener) {
		mCardList=new ArrayList<CardViewer>(TOTAL_CARDS);
		this.mDealListener = dealListener;
		createDeck();
	}

	private void createDeck() {
		for(Suit suit: Suit.values()){
			for(Rank rank : Rank.values()){
				mCardList.add(new Card(suit, rank));
			}

		}
	}


	public void showCards(){
		for (int i = 0; i < mCardList.size(); i++) {
			System.out.println("Suit :"+mCardList.get(i).getSuit() + "   "+"Rank :"+ mCardList.get(i).getRank());
		}
	}

	public void shuffleDeck(){
		Collections.shuffle(mCardList);
	}


	public void dealOneCard() {
		if(mCardIndex<TOTAL_CARDS)
			mDealListener.getCard(mCardList.get(mCardIndex++));
		else
			mDealListener.dealFailed();
	}
}
