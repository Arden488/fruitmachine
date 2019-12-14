import java.awt.event.*;

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
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.controlsPanel.spinButton) {
            doSpin();

            if (model.getGameEnded()) {
                setEndGameControls();
            }
        }

        if (e.getSource() == view.controlsPanel.newGameButton) {
            startNewGame();
        }
    }

    private void doSpin() {
        model.spinCards();
        view.updateView();
    }

    private void setEndGameControls() {
        view.controlsPanel.newGameButton.setEnabled(true);
        view.controlsPanel.spinButton.setEnabled(false);
    }

    private void startNewGame() {
        view.controlsPanel.newGameButton.setEnabled(false);
        view.controlsPanel.spinButton.setEnabled(true);
        model.reset();
        view.updateView();
    }
}