public class QuickSort {
    public static void main(String[] args) {
        int[] data = {9,2,5,10,15,30,68};
        printArray(data);

        quick_sort(data, 0, data.length-1);

        printArray(data);
    }
    public static void quick_sort(int[] data,int low,int high){
        boolean flag = true;
        if (low < high) {
            int i = low;
            int j = high+1;
            int key = data[low];

            while (flag) {
                i++;
                while (i < high && data[i] < key) {
                    i++;
                }
                j--;
                while (j > low && data[j] > key) {
                    j--;
                }

                if (i < j) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
                else{
                    flag = false;
                }
            }
            int temp = data[low];
            data[low] = data[j];
            data[j] = temp;

            quick_sort(data, low, j-1);
            quick_sort(data, j+1, high);
        }
    }

    public static void printArray(int[] data){
        System.out.print("[ ");
        for (int i : data) {
            System.out.print(i + " ,");
        }
        System.out.println("\b]");
    }
}
