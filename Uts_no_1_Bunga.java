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
public class Uts_no_1_Bunga extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g;
        
        int r = 150, d=(5/4) * r, x=0, y=r;
        
        do{
            gd.setColor(Color.RED);
            gd.drawLine(y + 200, x + 200, y + 200, x + 200);
            gd.drawLine(x + 200, y + 200, x + 200, y + 200);
            gd.drawLine(x + 200, -y + 200, x + 200, -y + 200);
            gd.drawLine(y + 200, -x + 200, y + 200, -x + 200);
            gd.drawLine(-y + 200, -x + 200, -y + 200, -x + 200);
            gd.drawLine(-x + 200, -y + 200, -x + 200, -y + 200);
            gd.drawLine(-x + 200, y + 200, -x + 200, y + 200);
            gd.drawLine(-y + 200, x + 200, -y + 200, x + 200);
            
            if(d < 0){
                d = d + 2 * x + 3;
            }else{
                d = d + 2 * (x - y) + 5;
                y = y - 1;
            }
            
            x = x + 1;
        }while(x<y);
    }
    
    public static void main(String[] args){
        Uts_no_1_Bunga g = new Uts_no_1_Bunga();
        JFrame jf = new JFrame();
        jf.add(g);
        jf.setSize(500,500);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}