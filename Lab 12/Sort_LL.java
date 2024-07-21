import MyFile.MyLinkedList;

public class Sort_LL {
    public static void main(String[] args) {
        MyLinkedList l1 = new MyLinkedList();
        int[] arr = {4,2,1,3};
        for (int i = 0; i < arr.length; i++) {
            l1.insertAtLast(arr[i]);
        }
        l1.display();
        l1.sort();

        l1.display();
    }
}
