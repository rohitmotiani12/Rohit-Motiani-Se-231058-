class SimpleStack {
    private int[] stack;
    private int top;
    public SimpleStack(int size) {
        stack = new int[size];
        top = -1;
    }
    public void push(int value) {
        if (top < stack.length - 1) {
            stack[++top] = value;
        }
    }
    public int pop() {
        return (top >= 0) ? stack[top--] : -1;
    }
    public int peek() {
        return (top >= 0) ? stack[top] : -1;
    }
    public int search(int value) {
        for (int i = 0; i <= top; i++) {
            if (stack[i] == value) return i;
        }
        return -1; // Not found
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public static String reverseString(String str) {
        SimpleStack stack = new SimpleStack(str.length());
        for (char ch : str.toCharArray()) stack.push(ch);
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append((char) stack.pop());
        return reversed.toString();
    }

    public static int reverseNumber(int num) {
        SimpleStack stack = new SimpleStack(String.valueOf(num).length());
        while (num > 0) {
            stack.push(num % 10);
            num /= 10;
        }
        int reversed = 0, multiplier = 1;
        while (!stack.isEmpty()) {
            reversed += stack.pop() * multiplier;
            multiplier *= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        System.out.println("Reversed String: " + reverseString("Hello"));
        System.out.println("Reversed Number: " + reverseNumber(12345));
        SimpleStack stack = new SimpleStack(5);
        stack.push(10);
        stack.push(20);
        System.out.println("Position of 20: " + stack.search(20));
        System.out.println("Top element (peek): " + stack.peek());
    }
}