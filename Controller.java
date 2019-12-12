/**
 * Controller class
 * Listens to events, updates model and view
 * 
 * @author Anton Samoilov, MSc SD <2459087S@student.gla.ac.uk> 2459087S
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        view.setVisible(true);
    }
}