class Node {
    int value;
    Node next; // Ab Node ka istemal ho raha hai

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedListLoopDetection {
    public static boolean hasLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;     // Fast pointer ko 2 steps aage badhao

            if (slow == fast) {        // Agar dono pointers milte hain, toh loop hai
                return true;
            }
        }
        return false;                 // Agar loop nahi hai
    }

    public static void main(String[] args) {
        // Example usage
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next; // Yeh loop create karta hai

        System.out.println(hasLoop(head)); // Output: true
    }
}