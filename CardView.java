import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Color;

public class CardView extends JPanel {
    public CardView() {
        Border blackline = BorderFactory.createLineBorder(Color.black);
        setLayout(new BorderLayout());
        setBackground(Color.YELLOW);
        setBorder(blackline);

        JLabel label = new JLabel("Joker");
        label.setHorizontalAlignment(JLabel.CENTER);

        this.add(label, BorderLayout.CENTER);
    }
}