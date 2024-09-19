class Threadsync {
    public static void main(String[] args) {
        Table obj = new Table();
        mythread1 t1 = new mythread1(obj);
        mythread2 t2 = new mythread2(obj);
        t1.start();
        t2.start();
    }
}

class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class mythread1 extends Thread {
    Table obj;

    mythread1(Table obj) {
        this.obj = obj;
    }

    public void run() {
        obj.printTable(5);
    }
}

class mythread2 extends Thread {
    Table obj;

    mythread2(Table obj) {
        this.obj = obj;
    }

    public void run() {
        obj.printTable(100);
    }
}