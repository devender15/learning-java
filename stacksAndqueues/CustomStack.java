package stacksAndqueues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    protected boolean isFull() {
        return ptr == data.length - 1;
    }

    protected boolean isEmpty() {
        return ptr==-1;
    }

    public int pop() throws StackExceptions {
        if(isEmpty()) {
            throw new StackExceptions("Stack is already empty, lol!");
        }
        int removed = data[ptr];
        ptr-=1;
        return removed;
    }

    public boolean push(int item) {
        if(isFull()) {
            System.out.println("Stack is full, lol!");
            return false;
        }
        ptr+=1;
        data[ptr] = item;
        return true;
    }
}
