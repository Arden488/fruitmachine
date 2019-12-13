import javax.swing.JPanel;
import java.awt.GridLayout;

public class BottomLeftView extends JPanel {
    public BottomLeftView(int UNIT) {
        setLayout(new GridLayout(1, 3, UNIT, UNIT));

        CardView cardOne = new CardView();
        CardView cardTwo = new CardView();
        CardView cardThree = new CardView();

        this.add(cardOne);
        this.add(cardTwo);
        this.add(cardThree);
    }
}