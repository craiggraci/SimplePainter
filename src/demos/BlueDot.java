/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;

import java.awt.Color;
import painter.SPainter;
import shapes.SCircle;

/**
 *
 * @author blue
 */
public class BlueDot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SPainter klee = new SPainter("Blue Dot",500,400);
        klee.setColor(Color.BLUE);
        SCircle dot = new SCircle(100);
        klee.paint(dot);
        klee.setColor(Color.BLACK);
        klee.setFontSize(48);
        klee.draw("BLUE DOT");
    }
}
