package Ball3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ball extends JPanel {

    public int x = 5;
    public int y = 5;
    public int z = 5;
    public int d = 5;
    
    Timer timer = new Timer(200, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    });

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, z, d);
        z = z + 1;
        d = d + 1;
        x = x + 1;
        y = y + 1;
        timer.start();
    }

}
