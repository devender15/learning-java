package linkedlist;

public class Main {
    public static void main(String[] args) {
        LL lst = new LL();
        lst.insertFirst(3);
        lst.insertFirst(4);
        lst.insertFirst(5);
        lst.insertFirst(6);
        lst.insertFirst(7);
////        lst.deleteFirst();
////        lst.deleteLast();
//        lst.deleteAt(2);
//
////        lst.insert(100, 3);
////
////        lst.insertLast(19);
//
        lst.insertRec(189, 1);
        lst.display();

//        DLL dll = new DLL();
//        dll.insertFirst(1);
//        dll.insertFirst(2);
//        dll.insertFirst(3);
//        dll.insertFirst(4);
//        dll.insertFirst(5);
//        dll.insertFirst(6);
//
//        dll.insertLast(100);
//
//        dll.insertAt(100, 50);
//
//
//        dll.display();

//        CLL lst = new CLL();
//        lst.insert(1);
//        lst.insert(2);
//        lst.insert(3);
//        lst.insert(4);
//        lst.insert(5);
//        lst.insert(6);
//
//        lst.delete(5);
//
//        lst.display();
    }
}
