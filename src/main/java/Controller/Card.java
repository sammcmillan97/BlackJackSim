package Controller;

public class Card {

    private int suit;
    private int value;

    public Card(int suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public int getSuit() {
        return this.suit;
    }

    public int getValue() {
        return this.value;
    }

    public String getSuitString() {
        return switch (this.suit) {
            case 1 -> "Clubs";
            case 2 -> "Diamonds";
            case 3 -> "Hearts";
            case 4 -> "Spades";
            default -> "";
        };
    }

    public String getValueString() {
        return switch (this.value) {
            case 1 -> "Ace";
            case 2 -> "2";
            case 3 -> "3";
            case 4 -> "4";
            case 5 -> "5";
            case 6 -> "6";
            case 7 -> "7";
            case 8 -> "8";
            case 9 -> "9";
            case 10 -> "10";
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            default -> "";
        };
    }

    public String toString() {
        return getValueString() + " of " + getSuitString();
    }
}
