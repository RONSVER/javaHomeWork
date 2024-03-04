package org.example.prof.lessonFive.homeWorkFive;



public class CardGiveLogic {

    Players players = new Players();

    public void theShuffledDeckIsDisplayed(String[] arr, int getCardsForPlayer, int ValuePlayers ) {
        for (int i = 0; i < ValuePlayers * getCardsForPlayer; i++) {
            System.out.println(arr[i]);

            if (i % getCardsForPlayer == getCardsForPlayer - 1) {
                System.out.println();
            }
        }
    }






}
