import java.util.*;

public class ReverseLL {
    // Corrected method name and parameter type
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) { // Corrected the condition to check if the stack is empty
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s); // Corrected method name
        s.push(top);
    }

    // Added return type for the method
    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s); // Corrected the case of 's'
        pushAtBottom(top, s); // Corrected method name
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        while (!s.isEmpty()) { // Corrected method call to isEmpty()
            System.out.println(s.peek());
            s.pop();
        }
    }
}