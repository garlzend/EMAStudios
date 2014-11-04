/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chipchallange;

import controller.Controller;
import interfaces.Modelled;
import java.awt.Dimension;
import javax.swing.JFrame;
import view.Canvas;

/**
 * Method inti yang menjalankan Game.
 * @author Ega Prianto
 */
public class ChipChalange {
    public static void main(String[] args) {
        JFrame f = new JFrame("EMA Chip Chalenge");
        Canvas ra = new Canvas();
        Modelled ctrl = new Controller(ra);
        ra.setCtrl(ctrl);
        Thread thread = new Thread((Controller)ctrl);
        thread.start();
        f.getContentPane().add("Center", ra);
        f.pack();
        f.setSize(new Dimension(800, 480));
        f.setVisible(true);
    }
}
