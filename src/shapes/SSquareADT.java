/*
 * Abstract Data Type for a simple Square Class
 */

package shapes;

/**
 *
 * @author blue
 */
public interface SSquareADT {
    public SCircle circumscribingCircle();
    public SCircle inscribingCircle();
    public double side();
    public double area();
    public double perimeter();
    public double diagonal();
    public void resetSide(int s);
    public void expand(double amount);
    public void shrink(double amount);
    public void s2();
    public void s3();
    public void s5();
    public void s7();
    public void x2();
    public void x3();
    public void x5();
    public void x7();
    @Override
    public String toString();
}
