public class BubbleSort {

    public static void main(String[] args) {
        int[] data = {2,4,0,6,10,19,8,21,50};
        int last = data.length-1;
        for (int i = 0; i < data.length-1; i++) {
            boolean b = false;
            for (int j = 0; j < last-1; j++) {
                if(data[j] > data[j+1]){
                    b = true;

                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
            if (!b) {
                System.out.print("Sorted = ");
                printArray(data);
                return;
            }
            last--;
        }   
        printArray(data);
    }
    public static void printArray(int[] data){
        System.out.print("[ ");
        for (int i : data) {
            System.out.print(i + " ,");
        }
        System.out.println("\b]");
    }
}