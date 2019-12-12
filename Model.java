/**
 * Model class
 * Stores and manipulates data
 * 
 * @author Anton Samoilov, MSc SD <2459087S@student.gla.ac.uk> 2459087S
 */
public class Model {
    private int balance;

    public Model() {
        reset();
    }

    private void reset() {
        balance = 100;
    }
}