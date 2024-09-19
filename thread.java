import java.util.Random;

class RandomNumber extends Thread {
    public void run() {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int a = r.nextInt(100);
            System.out.println("Integer generated:");
            if (a % 2 == 0) {
                Square s = new Square(a);
                s.start();
            } else {
                Cube c = new Cube(a);
                c.start();
            }
            try {
                sleep(1000);
            } catch (Exception e) {
                System.out.println("Exception occured");
            }
        }
    }
}

class Square extends Thread {
    int number;

    Square(int num) {
        number = num;
    }

    public void run() {
        System.out.println("Square is:" + number * number);
    }
}

class Cube extends Thread {
    int number;

    Cube(int num) {
        number = num;
    }

    public void run() {
        System.out.println("Cube is:" + number * number * number);
    }
}
class thread {
    public static void main(String[] args) {
        RandomNumber th = new RandomNumber();
        th.start();
    }
}
