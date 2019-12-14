import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;

public class ControlsPanelView extends JPanel {
    public JButton spinButton, newGameButton;

    public ControlsPanelView(int UNIT, Controller controller) {
        spinButton = new JButton("spin");
        newGameButton = new JButton("new game");

        spinButton.addActionListener(controller);
        newGameButton.addActionListener(controller);
        newGameButton.setEnabled(false);

        this.setLayout(new GridLayout(2, 1));
        this.setBorder(new EmptyBorder(UNIT * 2, UNIT * 3, UNIT * 2, UNIT * 3));

        this.add(spinButton);
        this.add(newGameButton);
    }

    public JButton getSpinButton() {
        return spinButton;
    }
}