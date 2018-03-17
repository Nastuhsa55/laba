package Ball3;

import com.sun.prism.Graphics;
import javax.swing.*;
import java.awt.*;

public class Ball3 {
 
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ball");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ball gui = new Ball();
        gui.setBackground(Color.WHITE);
        Ball balls = new Ball();
        frame.add(gui);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

}
