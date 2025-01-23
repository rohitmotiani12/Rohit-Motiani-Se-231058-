public class DeleteDLL {
    public class Node {
        String data;
        Node next;
        Node prev;

        Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;

    // Method to delete a node by value
    public void deleteNode(String data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                // Node found
                if (current.prev != null) {
                    current.prev.next = current.next; // Link previous node to next node
                } else {
                    head = current.next; // If it's the head node
                }
                if (current.next != null) {
                    current.next.prev = current.prev; // Link next node to previous node
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Node with data '" + data + "' not found.");
    }
    public void printList() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteDLL dll = new DeleteDLL();
        // Adding some nodes for testing
        dll.head = dll.new Node("first");
        Node second = dll.new Node("second");
        Node third = dll.new Node("third");
        dll.head.next = second;
        second.prev = dll.head;
        second.next = third;
        third.prev = second;
        System.out.println("List before deletion:");
        dll.printList();
        dll.deleteNode("second");
        System.out.println("List after deletion:");
        dll.printList();
    }
}