package org.example.prof.lessonFive.homeWorkFive;

import java.util.Arrays;
import java.util.Random;

public class CardDeck {
    static CardGiveLogic cardGiveLogic = new CardGiveLogic();
    static Players players = new Players();
    static int CardsForPlayer = players.getCardsForPlayer();
    static final Random random = new Random();
    static private final Suits[] SUITS = Suits.values();
    static private final Rank[] RANK = Rank.values();
    final int numberOfCards = SUITS.length * RANK.length;

    public int getNumberOfCards() {
        return this.numberOfCards;
    }

    public void deckInitialization(int players) {
        String[] deck = new String[numberOfCards];
        for (int i = 0; i < RANK.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {

                deck[RANK.length * j + i] = RANK[i].toString() + " " + SUITS[j].toString();
            }
        }
        String[] shufflingArr = deckShuffling(deck);

        cardGiveLogic.theShuffledDeckIsDisplayed(shufflingArr, CardsForPlayer, players);

    }

    public String[] deckShuffling(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int card = i + random.nextInt(numberOfCards - i);
            String temp = arr[card];
            arr[card] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}



