public class ShellSort {
    public static void main(String[] args) {
        int[] data = { 2, 4, 0, 6, 10, 19, 8, 21, 50 };
        printArray(data);

        shell_sort(data);
        printArray(data);
    }

    public static void shell_sort(int[] arr) {
        for (int gap = arr.length/ 2; gap >=1; gap = gap / 2) {
            for (int j = gap; j < arr.length; j++) {
                for (int i = j - gap; i >= 0; i-= gap) {
                    if (arr[i] < arr[i + gap]) {
                        break;
                    } else {
                        int temp = arr[i + gap];
                        arr[i + gap] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
    }

    public static void printArray(int[] data) {
        System.out.print("[ ");
        for (int i : data) {
            System.out.print(i + " ,");
        }
        System.out.println("\b]");
    }
}
