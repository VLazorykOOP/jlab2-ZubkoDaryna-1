import java.util.Stack;
class MyStack {
    private Stack<Integer> stack = new Stack<Integer>();

    public void push(int value) {
        stack.push(value);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean containsValue(int value) {
        return stack.contains(value);
    }

    public int pop() {
        return stack.pop();
    }

    public void removeValue(int value) {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        if (stack.contains(value)) {
            stack.removeElement(value);
        } else {
            System.out.println("Value not found in the stack.");
        }
    }
}

