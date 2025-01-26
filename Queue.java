class Q {
    private int[] arr; // Array to hold the queue elements
    private int size; // Maximum size of the queue
    private int rear = -1; // Index of the last element

    // Constructor to initialize the queue
    public Q(int size) {
        this.size = size; // Store the size
        arr = new int[size]; // Initialize the array with the given size
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return rear == -1; // Return true if rear is -1
    }

    // Enqueue or add
    public void add(int data) {
        if (rear == size - 1) { // Check if the queue is full
            System.out.println("Queue is full");
            return;
        }
        rear++; // Increment rear
        arr[rear] = data; // Add data to the queue
        System.out.println(data + " added to the queue."); // Inform the user
    }

    // Dequeue or remove
    public int remove() {
        if (isEmpty()) { // Check if the queue is empty
            System.out.println("Queue is empty");
            return -1; // Return -1 if empty
        }
        int front = arr[0]; // Get the front element
        // Shift elements to the left
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        arr[rear] = 0; // Optional: Clear the last element
        rear--; // Decrement rear
        System.out.println(front + " removed from the queue."); // Inform the user
        return front; // Return the front element
    }

    // Peek at the front element
    public int peek() {
        if (isEmpty()) { // Check if the queue is empty
            System.out.println("Queue is empty");
            return -1; // Return -1 if empty
        }
        return arr[0]; // Return the front element
    }

    public static void main(String[] args) {
        Q q = new Q(5); // Create a queue of size 5
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        // Peek and remove elements until the queue is empty
        while (!q.isEmpty()) {
            System.out.println("Front element: " + q.peek()); // Print the front element
            q.remove(); // Remove the front element
        }
    }
}