public class CircularQueue {
    int[] q;
    int f = -1, r = -1;

    public CircularQueue(int size) {
        q = new int[size];
    }

    public void enqueue(int y) {
        if (r + 1 == f || (r >= q.length - 1 && f == 0)) {
            System.out.println("Queue Overflow");
            return;
        }
        r++;
        if (r > q.length - 1) {
            r = 0;
        }
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
            if (f == q.length - 1) {
                f = 0;
            } else {
                f++;
            }
        }
        return y;
    }

    public void display(){
        if (f < 0) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.print("[");
        for (int i = f; i != r; ) {
            System.out.print(q[i] + " ,");
            if (i == q.length-1) {
                i = 0;
            }else{
                i++;
            }
        }
        System.out.println(q[r] + "]");
    }
}