import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;

public class MessagesPanelView extends JPanel {
    private JLabel balanceLabel, statusLabel, messageLabel;

    public MessagesPanelView(int UNIT, String balance, String message, String status) {
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(0, 0, UNIT, 0));

        balanceLabel = new JLabel(balance);
        messageLabel = new JLabel(message);
        statusLabel = new JLabel(status);

        this.add(balanceLabel, BorderLayout.NORTH);
        this.add(messageLabel, BorderLayout.CENTER);
        this.add(statusLabel, BorderLayout.SOUTH);
    }

    public void updateEndGame(String status) {
        statusLabel.setText(status);
    }

    public void updateMessage(String message) {
        messageLabel.setText(message);
    }

    public void updateBalance(String balance) {
        balanceLabel.setText(balance);
    }
}