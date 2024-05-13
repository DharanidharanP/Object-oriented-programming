package MultiThread;

class Book implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(2000);
                System.out.println("updateDb...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Number extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i + " ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadSamble {
    public static void main(String[] args) throws InterruptedException {
        
    	Runnable book=() ->
    	{
    		for(int i=1;i<=5;i++) {
    			System.out.println("udateDb");
    		}
    	};
    	Book book1 = new Book();
        Number num = new Number();
        
        Thread bookThread = new Thread(book1);
        bookThread.start();
        
        num.start();
        bookThread.setName("Dharani");
        bookThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(bookThread.getPriority());
        System.out.println(bookThread.getName());
    }
}
