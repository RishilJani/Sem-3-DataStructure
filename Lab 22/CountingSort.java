import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = { 9, 2, 5, 10, 15, 30, 68 };
        CountingSort cs = new CountingSort();
        printArray(arr);
        int[] ans = cs.cSort(arr);
        printArray(ans);
    }

    public int[] cSort(int[] arr) {
        int maxx = 0;
        for (int i : arr) {
            maxx = Math.max(maxx, i);
        }
        int[] b = new int[arr.length];
        int[] c = new int[maxx + 1];
        Arrays.fill(c, 0);
        for (int i = 0; i < arr.length; i++) {
            c[arr[i]]++;
        }
        for (int i = 1; i < c.length; i++) {
            c[i] = c[i] + c[i - 1];
        }
        for (int i = arr.length-1; i >=0; i--) {
            b[c[arr[i]] -1] = arr[i];
            c[arr[i]]--;
        }
        return b;
    }

    public static void printArray(int[] a) {
        System.out.print("[ ");
        for (int i : a) {
            System.out.print(i + " ,");
        }
        System.out.println("\b]");
    }

}
