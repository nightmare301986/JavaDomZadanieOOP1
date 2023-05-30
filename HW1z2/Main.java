package HW1z2;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(8.0, 2.0);

        r1.rectangleShow();
        r2.rectangleShow();

        r1.calculateArea();
        r2.calculateArea();

        r1.calculatePerimeter();
        r2.calculatePerimeter();

        r1.showArea();
        r2.showArea();

        r1.showPerimeter();
        r2.showPerimeter();
    }
}
