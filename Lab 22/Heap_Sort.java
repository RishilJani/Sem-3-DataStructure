public class Heap_Sort {
    public static void main(String[] args) {
        int[] arr = { 9, 2, 5, 10, 15, 30, 68 };
        Heap_Sort h1 = new Heap_Sort();
        printArray(arr);
        h1.HeapSort(arr);

        printArray(arr);
    }

    public void HeapSort(int[] arr) {
        buildMaxHeap(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public void buildMaxHeap(int[] arr) {
        for (int i = (arr.length / 2) - 1; i >=0; i--) {
            heapify(arr, arr.length, i);
            // heapify(arr, arr.length, i);
        }
    }

    public void heapify(int[] arr, int n, int i) {
        int maxInd = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[maxInd] < arr[left]) {
            maxInd = left;
        }
        if (right < n && arr[maxInd] < arr[right]) {
            maxInd =right;
        }
        if (maxInd != i) {
            int temp = arr[i];
            arr[i] = arr[maxInd];
            arr[maxInd] = temp;

            heapify(arr,n, maxInd);
        }
    }

    public static void printArray(int[] a) {
        System.out.print("[ ");
        for (int i : a) {
            System.out.print(i + " ,");
        }
        System.out.println("\b]");
    }
}