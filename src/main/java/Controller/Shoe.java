package Controller;

import java.util.ArrayList;
import java.util.Collections;

public class Shoe {

    ArrayList<Card> shoe;

    public Shoe(int numOfDecks) {
        shoe = new ArrayList<>();
        addDecks(numOfDecks);
    }

    private void addDecks(int numOfDecks) {
        for (int i = 0; i < numOfDecks; i++) {
            addDeck();
        }
    }

    private void addDeck() {
        int[] suits = new int[]{1, 2, 3, 4};
        int[] values = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        for (int suit: suits) {
            for (int value: values) {
                Card card = new Card(suit, value);
                this.shoe.add(card);
            }
        }
    }

    public void printShoe() {
        for (Card card: this.shoe) {
            System.out.println(card);
        }
    }

    public void shuffle() {
        Collections.shuffle(this.shoe);
    }

    public static void main(String[] args) {
        Shoe shoe = new Shoe(2);
        shoe.shuffle();
        shoe.printShoe();
    }
}
