public class DLL {
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
        DLL  l =new DLL();
        l.addF("a");
        l.addF("is");
        l.addF("this ");
        l.print();

    }
}
// this is basic code of douboy linked list
//  ye code single linked lsit wala h just isme