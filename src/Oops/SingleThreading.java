package Oops;

// Single Threading = Program executes one thread sequentially
// A thread is a single sequential flow of execution within a program

// Method 1: Extending Thread class
class CounterThread extends Thread {
    private String threadName;
    private int count;

    CounterThread(String name, int count) {
        this.threadName = name;
        this.count = count;
    }

    @Override
    public void run() {
        // Code that runs when thread starts
        for (int i = 1; i <= count; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500);  // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadName + " finished!");
    }
}

// Method 2: Implementing Runnable interface (more flexible)
class DownloadTask implements Runnable {
    private String fileName;

    DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Downloading " + fileName + "...");
        for (int i = 0; i <= 100; i += 20) {
            System.out.println(fileName + " - " + i + "% downloaded");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(fileName + " download completed!");
    }
}

public class SingleThreading {
    public static void main(String[] args) {

        System.out.println("=== Method 1: Extending Thread ===");
        CounterThread thread1 = new CounterThread("Thread-1", 3);
        thread1.start();  // Starts the thread (calls run() internally)

        System.out.println("\n=== Method 2: Implementing Runnable ===");
        DownloadTask task = new DownloadTask("video.mp4");
        Thread thread2 = new Thread(task);
        thread2.start();  // Starts the thread

        System.out.println("\n=== Main thread continues ===");
        System.out.println("Main thread is doing other work...");
    }
}

// Note: In single threading, the main program executes one thread at a time
// If you create multiple threads but want sequential execution,
// you can use thread.join() to wait for a thread to complete
