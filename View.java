import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridLayout;
import javax.swing.border.EmptyBorder;

/**
 * View class
 * Displays and connects parts of GUI, shows data and attaches listeners
 * 
 * @author Anton Samoilov, MSc SD <2459087S@student.gla.ac.uk> 2459087S
 */
public class View extends JFrame {
    public View() {
        final int UNIT = 20;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(UNIT * 30, UNIT * 20);
        setLocation(UNIT * 10, UNIT * 10);
        setTitle("Fruit Machine");

        JPanel wrapper = new JPanel();
        wrapper.setBorder(new EmptyBorder(UNIT, UNIT, UNIT, UNIT));
        wrapper.setLayout(new GridLayout(2, 2));

        TopLeftView tlv = new TopLeftView(UNIT);
        TopRightView trv = new TopRightView();
        BottomLeftView blv = new BottomLeftView(UNIT);
        BottomRightView brv = new BottomRightView(UNIT);

        wrapper.add(tlv);
        wrapper.add(trv);
        wrapper.add(blv);
        wrapper.add(brv);

        this.add(wrapper);
    }
}