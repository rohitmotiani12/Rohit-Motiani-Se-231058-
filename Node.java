class Node {
    int val; // Value of the node
    Node next; // Pointer to the next node

    Node(int x) {
        val = x; // Set the node's value
    }
}

class LinkedListLoop {
    public boolean hasCycle(Node head) {
        if (head == null) return false; // No nodes, no cycle

        Node slow = head; // Slow pointer
        Node fast = head; // Fast pointer

        while (fast != null && fast.next != null) {
            slow = slow.next;           // Move slow pointer by 1
            fast = fast.next.next;     // Move fast pointer by 2

            if (slow == fast) {        // They meet, cycle exists
                return true;
            }
        }
        return false; // No cycle found
    }

    public static void main(String[] args) {
        // Create a linked list with a loop
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2; // Connect node1 to node2
        node2.next = node3; // Connect node2 to node3
        node3.next = node1; // Connect node3 back to node1 (creates a loop)

        LinkedListLoop detector = new LinkedListLoop();
        System.out.println(detector.hasCycle(node1)); // Output: true (cycle detected)
    }
}
// this is code to detect  loop in linked list