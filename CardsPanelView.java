import javax.swing.JPanel;
import java.awt.GridLayout;
import java.util.Random;

public class CardsPanelView extends JPanel {
    public CardView cardOne, cardTwo, cardThree;

    public CardsPanelView(int UNIT) {
        setLayout(new GridLayout(1, 3, UNIT, UNIT));
    }

    public void renderCards(String cardOneLabel, String cardTwoLabel, String cardThreeLabel) {
        cardOne = new CardView(cardOneLabel);
        cardTwo = new CardView(cardTwoLabel);
        cardThree = new CardView(cardThreeLabel);

        this.add(cardOne);
        this.add(cardTwo);
        this.add(cardThree);
    }

    public void updateCards(String cardOneLabel, String cardTwoLabel, String cardThreeLabel) {
        cardOne.update(cardOneLabel);
        cardTwo.update(cardTwoLabel);
        cardThree.update(cardThreeLabel);
    }
}