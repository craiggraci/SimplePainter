/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilities;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author blue
 */
public class Random {

    /** @return random color */
    static public Color color() {
        int rv = (int)(Math.random()*256);
        int gv = (int)(Math.random()*256);
        int bv = (int)(Math.random()*256);
        return new Color(rv,gv,bv);
    }

    public static int integer(int low, int high) {
        int n = (int)(Math.random()*(high-low+1)) + 1;
        return n;
    }

    public static Point point(int w, int h) {
        int x = (int)(Math.random()*(w+1));
        int y = (int)(Math.random()*(h+1));
        return new Point(x,y);
    }

}