/**
 * Controller class
 * Listens to events, updates model and view
 * 
 * @author Anton Samoilov, MSc SD <2459087S@student.gla.ac.uk> 2459087S
 */
public class Controller {
    private Model modelRef; // ? Is it references or objects?
    private View viewRef;

    public Controller(Model model, View view) {
        modelRef = model;
        viewRef = view;

        view.setVisible(true);
    }
}