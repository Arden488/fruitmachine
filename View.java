import javax.swing.JFrame;

/**
 * View class
 * Displays and connects parts of GUI, shows data and attaches listeners
 * 
 * @author Anton Samoilov, MSc SD <2459087S@student.gla.ac.uk> 2459087S
 */
public class View extends JFrame {
    public View() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 450);
        setLocation(100, 100);
        setTitle("Fruit Machine");
        // setLayout(new GridLayout(5,2));
    }
}