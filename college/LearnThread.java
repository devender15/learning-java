package college;


class OriginalOrderThread extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Original order: " + i);
        }
    }
}

class ReverseOrderThread extends Thread {
    public void run() {
        for (int i = 50; i >0 ; i--) {
            System.out.println("Reverse order: " + i);
        }
    }
}
public class LearnThread {
    public static void main(String[] args) {
        OriginalOrderThread ot = new OriginalOrderThread();
        ReverseOrderThread rt = new ReverseOrderThread();

        ot.run();
        rt.run();
    }
}
