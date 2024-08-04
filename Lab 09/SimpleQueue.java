public class SimpleQueue {
    int[] q;
    int f = -1, r = -1;

    public SimpleQueue(int n) {
        q = new int[n];
    }

    public void enqueue(int y) {
        if (r >= q.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        r++;
        q[r] = y;
        if (f == -1) {
            f++;
        }
    }

    public int dequeue() {
        if (f < 0) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int y = q[f];
        if (f == r) {
            f = -1;
            r = -1;
        } else {
            f++;
        }
        return y;
    }

    public void display() {
        if (f < 0) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.print("[");
        for (int i = f; i <= r; i++) {
            System.out.print(q[i] + " ,");
        }
        System.out.println("]");
    }
}
