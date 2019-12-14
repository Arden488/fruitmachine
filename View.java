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
    private Model model;
    private CardsPanelView cardsPanel;
    private MessagesPanelView messagesPanel;
    public ControlsPanelView controlsPanel;
    public JButton spinButton, newGameButton;

    public View(Model model, Controller controller) {
        this.controller = controller;
        this.model = model;

        final int UNIT = 20;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(UNIT * 30, UNIT * 20);
        setLocation(UNIT * 10, UNIT * 10);
        setTitle("Fruit Machine");
        renderPanels(UNIT);
    }

    private void renderPanels(int UNIT) {
        JPanel wrapper = new JPanel();
        wrapper.setBorder(new EmptyBorder(UNIT, UNIT, UNIT, UNIT));
        wrapper.setLayout(new GridLayout(2, 2));

        messagesPanel = new MessagesPanelView(UNIT);
        wrapper.add(messagesPanel);

        JPanel emptyPanel = new JPanel();
        wrapper.add(emptyPanel);

        cardsPanel = new CardsPanelView(UNIT);
        wrapper.add(cardsPanel);

        controlsPanel = new ControlsPanelView(UNIT, controller);
        wrapper.add(controlsPanel, BorderLayout.CENTER);

        this.add(wrapper);
    }

    public void updateView() {
        messagesPanel.updateBalance(model.getBalanceMessage());
        messagesPanel.updateMessage(model.getMessage());
        messagesPanel.updateEndGame(model.getEndGameStatus());
        cardsPanel.updateCards(model.getCardOne(), model.getCardTwo(), model.getCardThree());
    }

    public void renderView() {
        messagesPanel.updateBalance(model.getBalanceMessage());
        messagesPanel.updateMessage(model.getMessage());
        messagesPanel.updateEndGame(model.getEndGameStatus());
        cardsPanel.renderCards(model.getCardOne(), model.getCardTwo(), model.getCardThree());
    }
}