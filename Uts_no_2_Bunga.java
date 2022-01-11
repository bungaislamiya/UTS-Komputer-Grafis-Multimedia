/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author lenovo
 */
public class Uts_no_2_Bunga {
    private int x;
    private int y;
    private int R = 10;
    private double alpha = 0;
    
    private final int SPEED = 1;
    private final Color COLOR = Color.red;
    
    public static void main(String[] args) { new Uts_no_2_Bunga().buildWindow();}
    
    public void buildWindow() {
        JFrame frame = new JFrame("Rotation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.add(new DrawPanel());
        while(true) {
            try {
                Thread.sleep(60);
                alpha += SPEED;
                frame.repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    @SuppressWarnings("serial")
    class DrawPanel extends JPanel {
        
        @Override
        public void paintComponent(Graphics g) {
            g.setColor(Color.blue);
            Font font = new Font("Arial",Font.PLAIN,12);
            g.setFont(font);
            g.drawString(String.format("Angle: %.2f ", alpha), 0, 12);
            
            g.setColor(Color.black);
            g.drawLine(this.getWidth()/2,0, this.getWidth()/2, this.getHeight());
            g.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
            
            double rads = (alpha * Math.PI) / 180F;
            x = (int) ((this.getWidth() / 2 - R / 2 ) + Math.round((R + 20) * Math.cos(rads)));
            y = (int) ((this.getHeight() / 2 - R / 2 ) - Math.round((R + 20) * Math.sin(rads)));
            
            g.setColor(COLOR);
            g.fillOval(x, y, R, R);
        } 
    }
}
