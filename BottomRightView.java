import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class BottomRightView extends JPanel {
    public BottomRightView(int UNIT) {

        JButton spinButton = new JButton("spin");
        JButton newGameButton = new JButton("new game");

        JPanel buttonBox = new JPanel();
        buttonBox.setLayout(new GridLayout(2, 1));
        buttonBox.setBorder(new EmptyBorder(UNIT * 2, UNIT * 3, UNIT * 2, UNIT * 3));

        buttonBox.add(spinButton);
        buttonBox.add(newGameButton);

        this.add(buttonBox, BorderLayout.CENTER);
    }
}