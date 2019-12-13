import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;

public class TopLeftView extends JPanel {
    public TopLeftView(int UNIT) {
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(0, 0, UNIT, 0));

        JLabel balanceLabel = new JLabel("balance is 100");
        JLabel messageLabel = new JLabel("welcome!");
        JLabel statusLabel = new JLabel("You win");

        this.add(balanceLabel, BorderLayout.NORTH);
        this.add(messageLabel, BorderLayout.CENTER);
        this.add(statusLabel, BorderLayout.SOUTH);
    }
}