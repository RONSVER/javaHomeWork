package org.example.prof.lessonEleven.homeWorkEleven.taskOneSpider;

class Card {
    private final Suits suit;
    private final Rank rank;

    public Card(Suits suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suits getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank + " suit " + suit;
    }
}