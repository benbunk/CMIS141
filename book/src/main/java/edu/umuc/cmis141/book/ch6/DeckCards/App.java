package edu.umuc.cmis141.book.ch6.deckcards;

public class App {

    public static void main(String[] args) {

        // 52 cards in a deck.
        int[] deck = new int[52];

        // Suit is found by cardNumber / 13.
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        // Rank is found by cardNumber % 13.
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King"};

        // Initialize the cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        // Shuffle the deck
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);

            // Just swapping the places of i and (random)index.
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = deck[temp];
        }

        // Display the first four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ":" + rank + " of " + suit);
        }
    }
}