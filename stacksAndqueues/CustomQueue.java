package stacksAndqueues;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = -1;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    protected boolean isFull() {
        return end == data.length;
    }

    protected boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if(isFull()) return false;
        data[end] = item;
        end += 1;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()) throw new Exception("Queue is empty, lol");
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end-=1;
        return removed;
    }

    public int front() throws Exception {
        if(isEmpty()) throw new Exception("queue is empty, lol");
        return data[0];
    }

}
