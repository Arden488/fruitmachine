import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;

public class ControlsPanelView extends JPanel {
    private Controller controller;

    public ControlsPanelView(int UNIT, Controller controller, JButton spinButton, JButton newGameButton) {
        // this.controller = controller;

        // spinButton = new JButton("spin");
        // newGameButton = new JButton("new game");

        // spinButton.addActionListener(controller);
        // newGameButton.addActionListener(controller);

        // JPanel buttonBox = new JPanel();
        // buttonBox.setLayout(new GridLayout(2, 1));
        // buttonBox.setBorder(new EmptyBorder(UNIT * 2, UNIT * 3, UNIT * 2, UNIT * 3));

        // buttonBox.add(spinButton);
        // buttonBox.add(newGameButton);

        // this.add(buttonBox, BorderLayout.CENTER);
    }
}