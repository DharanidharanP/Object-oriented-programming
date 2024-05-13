package MultiThread;

class Table {
    public synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizedMultiThread {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t = new Thread(() -> {
            table.printTable(5);
        });
        Thread t1 = new Thread(() -> {
            table.printTable(10);
        });
        t.start(); 
        t1.start(); 
    }
}
