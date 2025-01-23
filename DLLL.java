public class DLLL {
    public class Node {
        String data;
        Node next;
        Node prev;         // newly addded this

        Node(String data) {
            this.data = data;
            this.next = null;
            this.prev  = null;// newly addded this
        }
    }

    Node head;

    public void addF(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev=newNode; // newly addded this
        head = newNode;
    }
    public void addE(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, set head to new node
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next; // Traverse to the last node
        }
        current.next = newNode; // Link the last node to the new node
        newNode.prev = current; // Set the new node's prev to the last node
    }
    public int length() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    public void  print() {
        Node current = head;
        if (head == null) {
            System.out.println("list is empty");
            return ;
        }
        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.next;
        }
        System.out.println("<->Null");

    }
    public static void main (String args[]){
        DLLL  l =new DLLL();
        l.addF("a");
        l.addF("is");
        l.addF("this ");
        l.print();
        l.addE("example");
        l.print();
        int lengthh = l.length();
        System.out.println("Length of the list: " + lengthh);

    }
}
// this is basic code of douboy linked list
//  ye code single linked lsit wala h just isme
// isme add at first and add at last ho rha h