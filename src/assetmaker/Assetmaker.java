/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assetmaker;

import javax.swing.JFrame;

/**
 *
 * @author samue
 */
public class Assetmaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Materializer mat = new Materializer();
        JFrame frame = new JFrame();
        frame.add(mat);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        JFrame test = new JFrame();
        saluRGBchooser ch = new saluRGBchooser();
        test.add(ch);
        test.setVisible(true);
    }
    
}
