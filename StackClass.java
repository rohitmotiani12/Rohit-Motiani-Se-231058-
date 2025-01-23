public class StackClass {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public Node head; // Head of the stack

        // Check if the stack is empty
        public boolean isEmpty() {
            return head == null; // Return true if head is null
        }

        // Push function to add an element to the stack
        public void push(int data) {
            Node newNode = new Node(data); // Create a new node for the data
            if (isEmpty()) {
                head = newNode; // If stack is empty, new node becomes the head
                return;
            }
            newNode.next = head; // Point new node to the current head
            head = newNode; // Update head to the new node
        }

        // Pop function to remove and return the top element of the stack
        public int pop() {
            if (isEmpty()) {
                return -1; // Indicate that the stack is empty
            }
            int top = head.data; // Get the data from the head
            head = head.next; // Move head to the next node
            return top; // Return the popped value
        }

        // Peek function to return the top element without removing it
        public int peek() {
            if (isEmpty()) {
                return -1; // Indicate that the stack is empty
            }
            return head.data; // Return the data from the head
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3); // Stack will be 3 -> 2 -> 1

        while (!s.isEmpty()) {
            System.out.println(s.peek()); // Print the top element
            s.pop(); // Remove the top element
        }
    }
}