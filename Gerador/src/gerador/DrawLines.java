/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerador;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author erick
 */
public class DrawLines extends JPanel{
    public void paintComponet( Graphics g){
        super.paintComponent(g);
        
        g.drawLine(0, 0, 250, 250);
        g.drawRect(getWidth()/10 , getHeight()/10,100,100);
        
    }
}
