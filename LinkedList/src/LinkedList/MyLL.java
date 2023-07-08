package LinkedList;

public class MyLL {
    Node head;
    private Node tail;
    public void display(){
        Node node=head;
        while(node!=null){
            System.out.print(node.val+"->");
            node=node.next;
        }
        System.out.println("END");
    }
    public void insertLast(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        tail=tail.next;
    }
    public int getLength(){
        int length=0;
        Node node=head;
        while(node!=null){
            length++;
            node=node.next;
        }
        return length;
    }
    public Node reverseKGroup(int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        Node current = head;
        Node prev = null;

        int length = getLength();
        int count = length / k;
        while (count > 0) {
            Node last = prev;
            Node newEnd = current;

            Node next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            prev = newEnd;
            count--;
        }
        return head;
    }
    public class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val= val;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
