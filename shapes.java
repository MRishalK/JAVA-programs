abstract class shape {
    abstract void numberofsides();
}

class rectangle extends shape {
    void numberofsides() {
        System.out.println("Rectangle sides are 4");
    }
}

class triangle extends shape {
    void numberofsides() {
        System.out.println("Triangle sides are 3");
    }
}

class hexagon extends shape {
    void numberofsides() {
        System.out.println("Hexagon sides are 6");
    }
}

public class shapes {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        triangle t = new triangle();
        hexagon h = new hexagon();
        r.numberofsides();
        t.numberofsides();
        h.numberofsides();
    }
}