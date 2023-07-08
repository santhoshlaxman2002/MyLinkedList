package LinkedList;

import LinkedList.MyLL;

public class Main {
    public static void main(String[] args) {
        MyLL list=new MyLL();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(60);
        list.insertLast(80);
        list.insertLast(70);
        list.insertLast(5);
        list.insertLast(9);
        list.reverseKGroup(2);
        list.display();
    }
}