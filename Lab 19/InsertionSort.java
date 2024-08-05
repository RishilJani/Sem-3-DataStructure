public class InsertionSort {

    public static void main(String[] args) {
        int[] data = { 2, 4, 0, 6, 10, 19, 8, 21, 50 };

        printArray(data);
        int k = 0;
        for (int i = 1; i < data.length; i++) {
            k = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > k) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = k;
        }
        printArray(data);
    }

    public static void printArray(int[] data) {
        System.out.print("[ ");
        for (int i : data) {
            System.out.print(i + " ,");
        }
        System.out.println("\b]");
    }
}