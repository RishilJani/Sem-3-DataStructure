
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 9, 15, 18, 22, 26, 29, 31 };
        int key = 35;
        BinarySearch b1 = new BinarySearch();
        int ind = b1.b_s(arr, key);
        System.out.println("key = " + key + " ind  = " + ind);
    }

    public int binary_Search(int[] arr, int left, int right, int key) {
        int mid = (left + right) / 2;
        if (left < right) {
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                return binary_Search(arr, mid + 1, right, key);
            } else {
                return binary_Search(arr, left, mid - 1, key);
            }
        }
        return -1;
    }

    public int b_s(int[] arr, int key) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}