class Merge_Sort {
    int[] a;

    public Merge_Sort(int[] arr) {
        a = arr;
    }

    public void mergeSort(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            
            merge(low, mid, high);
        }
    }
    
    public void merge(int low,int mid,int high){
        int[] b = new int[(high-low+1)];
        int h = low,i = 0,j = mid+1;

        while (h <= mid && j <= high) {
            if (a[h] <= a[j]) {
                b[i] = a[h];
                h++;
            }else{
                b[i] = a[j];
                j++;
            }
            i++;
        }

        while (h <= mid) {
            b[i] = a[h];
            i++;
            h++;
        }
        while (j <= high) {
            b[i] = a[j];
            i++;
            j++;
        }

        for(int k = 0; k < b.length;k++){
            a[k+low] = b[k];
        }
    }

    public void printArray() {
        System.out.print("[ ");
        for (int i : a) {
            System.out.print(i + " ,");
        }
        System.out.println("\b]");
    }
}

public class MergeSort {

    public static void main(String[] args) {
        int[] data = {9,2,5,10,15,30,68};
        Merge_Sort m1 = new Merge_Sort(data);
        m1.mergeSort(0, data.length-1);
        m1.printArray();
    }

    
}
