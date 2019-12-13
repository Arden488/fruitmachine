import java.awt.event.*;

import javax.swing.JOptionPane;

/**
 * Controller class
 * Listens to events, updates model and view
 * 
 * @author Anton Samoilov, MSc SD <2459087S@student.gla.ac.uk> 2459087S
 */
public class Controller implements ActionListener {
    private Model model;
    private View view;

    public Controller(Model model) {
        this.model = model;
    }

    public void setView(View view) {
        this.view = view;
        view.renderView(model.getEndGameStatus(), model.getMessage(), model.getBalanceMessage(), model.getCardOne(),
                model.getCardTwo(), model.getCardThree());
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.spinButton) {
            model.spinCards();
            view.updateView(model.getEndGameStatus(), model.getMessage(), model.getBalanceMessage(), model.getCardOne(),
                    model.getCardTwo(), model.getCardThree());

            if (model.getGameEnded()) {
                view.newGameButton.setEnabled(true);
                view.spinButton.setEnabled(false);
            }
        }

        if (e.getSource() == view.newGameButton) {
            view.newGameButton.setEnabled(false);
            view.spinButton.setEnabled(true);
            model.reset();
            view.updateView(model.getEndGameStatus(), model.getMessage(), model.getBalanceMessage(), model.getCardOne(),
                    model.getCardTwo(), model.getCardThree());
        }
    }
}