import MyFile.MyLinkedList;
import MyFile.Node;

public class GCD {
    public static void main(String[] args) {
        MyLinkedList ll1 = new MyLinkedList();
        int[] data = {18,6,10,3};
        for (int i = 0; i < data.length; i++) {
            ll1.insertAtLast(data[i]);
        }
        ll1.display();
        GCD g1 = new GCD();

        g1.insertGCD(ll1.first);
        ll1.display();
    }
    public void insertGCD(Node first){
        Node i = first;
        while (i.next != null) {
            Node temp = i;
            int g = gcd(temp.data, temp.next.data);
            Node newNode = new Node(g);
            newNode.next = temp.next;
            temp.next = newNode;
            i = i.next.next;
        }
    }
    public int gcd(int n1,int n2){
        int ans = 1;
        for (int i = 2; i <= Math.min(n1, n2); i++) {
            if(n1 % i == 0 && n2 % i == 0){
                ans = i;
            }
        }
        return ans;
    }
}
