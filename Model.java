import java.util.Random;

/**
 * Model class
 * Stores and manipulates data
 * 
 * @author Anton Samoilov, MSc SD <2459087S@student.gla.ac.uk> 2459087S
 */
public class Model {
    private final String[] cardLabels = { "Joker", "Ace", "Jack", "Queen", "King" };
    private int balance;
    private int cardOneID, cardTwoID, cardThreeID;
    private String endGameStatus;
    private boolean gameEnded;
    private String message;
    private final int jokerWeight = 25;
    private final int fullSequenceWeight = 50;
    private final int partSequenceWeight = 20;
    private final int minBalance = 0;
    private final int winBalance = 150;

    public Model() {
        reset();
    }

    public String getCardOne() {
        return getCardLabel(cardOneID);
    }

    public String getCardTwo() {
        return getCardLabel(cardTwoID);
    }

    public String getCardThree() {
        return getCardLabel(cardThreeID);
    }

    public int getBalance() {
        return balance;
    }

    public String getBalanceMessage() {
        return "balance is " + balance;
    }

    public String getEndGameStatus() {
        return endGameStatus;
    }

    public boolean getGameEnded() {
        return gameEnded;
    }

    public String getMessage() {
        return message;
    }

    public void spinCards() {
        Random rand = new Random();
        int rand1 = rand.nextInt(4);
        int rand2 = rand.nextInt(4);
        int rand3 = rand.nextInt(4);

        cardOneID = rand1;
        cardTwoID = rand2;
        cardThreeID = rand3;

        updateBalance(cardOneID, cardTwoID, cardThreeID);
        checkWinOrLose();
    }

    private void checkWinOrLose() {
        if (balance < minBalance) {
            endGameStatus = "You lose";
            gameEnded = true;
        } else if (balance >= winBalance) {
            endGameStatus = "You win";
            gameEnded = true;
        }
    }

    private int countJoker(int cardOneID, int cardTwoID, int cardThreeID) {
        int count = 0;

        if (cardOneID == 0)
            count++;
        if (cardTwoID == 0)
            count++;
        if (cardThreeID == 0)
            count++;

        return count;
    }

    private void updateBalance(int cardOne, int cardTwo, int cardThree) {
        int countJokers = countJoker(cardOne, cardTwo, cardThree);
        if (countJokers > 0) {
            int lostBalance = jokerWeight * countJokers;
            balance -= lostBalance;
            message = countJokers + " Joker(s): you lose " + lostBalance + " points";
        } else {
            if (cardOne == cardTwo && cardTwo == cardThree) {
                balance += fullSequenceWeight;
                message = "Three of a kind - you win " + fullSequenceWeight + " points";
            } else if (cardOne == cardTwo || cardTwo == cardThree || cardOne == cardThree) {
                balance += partSequenceWeight;
                message = "Two of a kind - you win " + partSequenceWeight + " points";
            } else {
                message = "Balance unchanged";
            }
        }
    }

    public String getCardLabel(int cardID) {
        return cardLabels[cardID];
    }

    public void reset() {
        balance = 100;
        cardOneID = 4;
        cardTwoID = 3;
        cardThreeID = 2;
        endGameStatus = "";
        message = "Welcome!";
        gameEnded = false;
    }
}