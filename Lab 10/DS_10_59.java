import MyFile.MyLinkedList;

public class DS_10_59 {
    public static void main(String[] args) {
        MyLinkedList m1 = new MyLinkedList();
        MyLinkedList m2 = new MyLinkedList();

        int[] arr1 = {1,2,5,3,15,18};
        int[] arr2 = {1,2,5,3,15,18};

        for (int i = 0; i < arr2.length; i++) {
            m1.insertInOrder(arr1[i]);
            m2.insertInOrder(arr2[i]);
        }

        System.out.println("m1 == m2 : " + m1.isEquals(m2));
    }
}
