
 public class MyIntStack {
    
    int[] stack;
    int top;

    public MyIntStack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int e) {
        if (top >= stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top] = e;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underfolow");
            return -1;
        }
        top--;
        return stack[top + 1];
    }

    public int peep(int i) {
        if (top - i + 1 < 0) {
            System.out.println("Stack OverFlow");
            return -1;
        }
        return stack[top - i + 1];
    }

    public void change(int i, int e) {
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

}
