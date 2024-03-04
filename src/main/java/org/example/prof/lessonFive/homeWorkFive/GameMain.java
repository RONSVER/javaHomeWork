package org.example.prof.lessonFive.homeWorkFive;

import java.util.Scanner;

public class GameMain {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Players players = new Players();
        CardDeck cardDeck = new CardDeck();
        int getCardsForPlayer = players.getCardsForPlayer();
        int getNumberOfCards = cardDeck.getNumberOfCards();

        while (true) {
            System.out.print("Hello welcome in poker game. Enter the number of players: ");
            if (scanner.hasNextInt()) {
                players.setPlayers(scanner.nextInt());
                int playersValue = players.getPlayers();

                if (playersValue * getCardsForPlayer <= getNumberOfCards) {
                    System.out.println();
                    cardDeck.deckInitialization(playersValue);
                    break;
                } else {
                    if (playersValue == 0) {
                        System.out.println("The game has been terminated.");
                        return;
                    } else if (playersValue < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
                scanner.next(); // Очистка буфера ввода
            }
        }


    }
}





// while(true) {
//         if (scanner.hasNextInt()) {
//        players.setPlayers(scanner.nextInt());
//int playersValue = players.getPlayers();
//                if (playersValue * getCardsForPlayer <= getNumberOfCards) {
//        cardDeck.deckInitialization();
//                    break;
//                            } else {
//                            if (playersValue == 0) {
//        System.out.println("The game has been terminated.");
//                        break;
//                                } else if (playersValue < 0) {
//        System.out.println("The number of players cannot be less than 0");
//                    } else {
//                            System.out.println("Too many players!");
//                    }
//                            }
//
//                            } else {
//                            System.out.println("You have not entered a number, or your number is too large!");
//                break;
//                        }
//                        }