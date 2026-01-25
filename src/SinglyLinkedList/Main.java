package SinglyLinkedList;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(45);
        list.addFirst(80);
        list.addFirst(55);
        list.addLast(90);
        
        
       // list.removeLast();
        //list.removefirst();
        
        list.display();

    }
}
