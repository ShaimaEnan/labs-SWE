package SinglyLinkedList;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        
        list.addfirst(10);
        list.addfirst(20);
        list.addfirst(45);
        list.addfirst(80);
        list.addfirst(55);
        list.addLast(90);
        
        
       // list.removeLast();
        //list.removefirst();
        
        list.display();

    }
}
