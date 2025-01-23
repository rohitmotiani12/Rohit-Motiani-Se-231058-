class LL {
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }

    public void deleteAtPosition(int position) {
        if (head == null)
        {
            System.out.println("List is empty");
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null || current.next == null) {
                System.out.println("Position out of bounds");
                return;
            }
            current = current.next;
        }
        current.next = current.next.next;
    }
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
 boolean search(String data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
         LL l = new LL();
        l.addFirst("a");
        l.addFirst("is");
        l.addFirst("this");
        System.out.println("Initial list:");
        l.printList();

        String searchTerm = "is";
        if (l.search(searchTerm)) {
            System.out.println(searchTerm + " is found in the list.");
        } else {
            System.out.println(searchTerm + " is not found in the list.");
        }
    }
}
