import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Color;

public class CardView extends JPanel {
    private JLabel label;

    public CardView(String cardLabel) {
        Border blackline = BorderFactory.createLineBorder(Color.black);
        setLayout(new BorderLayout());
        setBackground(Color.YELLOW);
        setBorder(blackline);

        label = new JLabel(cardLabel);
        label.setHorizontalAlignment(JLabel.CENTER);

        this.add(label, BorderLayout.CENTER);
    }

    public void update(String cardLabel) {
        label.setText(cardLabel);
    }
}