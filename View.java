import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.border.EmptyBorder;

/**
 * View class
 * Displays and connects parts of GUI, shows data and attaches listeners
 * 
 * @author Anton Samoilov, MSc SD <2459087S@student.gla.ac.uk> 2459087S
 */
public class View extends JFrame {
    private Controller controller;
    private CardsPanelView cardsPanel;
    private MessagesPanelView messagesPanel;
    public JButton spinButton, newGameButton;

    public View(Controller controller) {
        this.controller = controller;
        final int UNIT = 20;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(UNIT * 30, UNIT * 20);
        setLocation(UNIT * 10, UNIT * 10);
        setTitle("Fruit Machine");

        JPanel wrapper = new JPanel();
        wrapper.setBorder(new EmptyBorder(UNIT, UNIT, UNIT, UNIT));
        wrapper.setLayout(new GridLayout(2, 2));

        messagesPanel = new MessagesPanelView(UNIT);
        EmptyPanelView emptyPanel = new EmptyPanelView();
        cardsPanel = new CardsPanelView(UNIT);
        // ControlsPanelView brv = new ControlsPanelView(UNIT, controller, spinButton,
        // newGameButton);

        wrapper.add(messagesPanel);
        wrapper.add(emptyPanel);
        wrapper.add(cardsPanel);
        // wrapper.add(brv);

        spinButton = new JButton("spin");
        newGameButton = new JButton("new game");

        spinButton.addActionListener(controller);
        newGameButton.addActionListener(controller);
        newGameButton.setEnabled(false);

        JPanel buttonBox = new JPanel();
        buttonBox.setLayout(new GridLayout(2, 1));
        buttonBox.setBorder(new EmptyBorder(UNIT * 2, UNIT * 3, UNIT * 2, UNIT * 3));

        buttonBox.add(spinButton);
        buttonBox.add(newGameButton);

        wrapper.add(buttonBox, BorderLayout.CENTER);

        this.add(wrapper);
    }

    public void updateView(String endGameStatus, String message, String balance, String cardOne, String cardTwo,
            String cardThree) {
        messagesPanel.updateBalance(balance);
        messagesPanel.updateMessage(message);
        messagesPanel.updateEndGame(endGameStatus);
        cardsPanel.updateCards(cardOne, cardTwo, cardThree);
    }

    public void renderView(String endGameStatus, String message, String balance, String cardOne, String cardTwo,
            String cardThree) {
        messagesPanel.updateBalance(balance);
        messagesPanel.updateMessage(message);
        messagesPanel.updateEndGame(endGameStatus);
        cardsPanel.renderCards(cardOne, cardTwo, cardThree);
    }
}