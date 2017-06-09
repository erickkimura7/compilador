/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerador;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import sun.java2d.loops.DrawLine;

/**
 *
 * @author erick
 */
public class Tela extends JPanel {
    
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawLine(0, 0, 250, 250);
        
    }
    public Tela(){
        JFrame j = new JFrame();
        j.add(this);
        j.setVisible(true);
        j.setTitle("osajdkasm");
        j.setSize(250, 250);
        j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        Tela tela = new Tela();
    }
    
}
