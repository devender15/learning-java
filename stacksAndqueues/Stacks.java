package stacksAndqueues;

import java.util.*;

public class Stacks {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//        stack.push(7);
//
//        System.out.println(stack.pop());

//        Queue<Integer> q = new LinkedList<>();
//        q.add(3);
//        q.add(4);
//        q.add(5);
//        q.add(6);
//        q.add(7);
//        System.out.println(q.remove());
//        System.out.println(q.peek());

        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(4);
        dq.add(5);
        dq.add(6);

        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());

    }
}
