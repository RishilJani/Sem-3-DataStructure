package MyFile;

public class MyCharStack {
    char[] stack;
    public int top;

    public MyCharStack(int size) {
        stack = new char[size];
        top = -1;
    }

    public void push(char e) {
        if (top >= stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top] = e;
    }

    public char pop() {
        if (top < 0) {
            System.out.println("Stack Underfolow");
            return ' ';
        }
        top--;
        return stack[top + 1];
    }

    public char peep(int i) {
        if (top - i + 1 < 0) {
            System.out.println("Stack OverFlow");
            return ' ';
        }
        return stack[top - i + 1];
    }

    public void change(int i, char e) {
        if (top - i + 1 < 0) {
            System.out.println("Stack OverFlow");
            return;
        }
        stack[top - i + 1] = e;
    }

    public void display() {
        System.out.print("stack = [");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ,");
        }
        System.out.println("\b]");
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;

    }

    public char peek() {
        if (top == -1) {
            System.out.println("Stack Underflow !!");
            return ' ';
        }
        return stack[top];
    }

}
