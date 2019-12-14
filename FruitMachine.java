/**
 * Assessed Exercise 3 "Fruit Machine"
 * Main class
 * Creates and connects model, view and controller
 * 
 * @author Anton Samoilov, MSc SD <2459087S@student.gla.ac.uk> 2459087S
 */
public class FruitMachine {
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);
        View view = new View(model, controller);
        controller.setView(view);
        view.setVisible(true);
    }
}