package com.cardgame;
import com.cardgame.CardViewer;

public class Card implements CardViewer {
	private Rank mRank;
	private Suit mSuit;

	public Card(Suit suit, Rank rank) {
		this.mRank=rank;
		this.mSuit=suit;
	}

	@Override
	public Rank getRank() {
		return mRank;
	}
	@Override
	public Suit getSuit() {
		return mSuit;
	}
	
	@Override
	public String toString() {
		return "CARD DELT:  Suit :"+mSuit + "   "+"Rank :"+ mRank;
	}

}
