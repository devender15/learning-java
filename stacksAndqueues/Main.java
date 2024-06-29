package stacksAndqueues;

public class Main {
    public static void main(String[] args) throws StackExceptions {
        CustomStack stack = new CustomStack(5);
        CustomQueue q = new CustomQueue(5);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//        System.out.println(stack.pop());
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.insert(1);
    }
}
