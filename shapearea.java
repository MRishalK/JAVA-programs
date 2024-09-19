//method overloading//

class Area {
    void areashape(double r) {
        double area;
        area = 3.14 * r * r;
        System.out.println("Area of circle is " + area);
    }

    void areashape(int l, int b) {
        int a;
        a = l * b;
        System.out.println("Area of rectangle is " + a);
    }

    void areashape(double h, double b) {
        double x;
        x = (h * b) / 2;
        System.out.println("Area of triangle is " + x);
    }
}

public class shapearea {

    public static void main(String[] args) {
        Area area = new Area();
        area.areashape(7);
        area.areashape(3, 2);
        area.areashape(2.5, 8.5);
    }
}
