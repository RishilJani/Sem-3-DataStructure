import java.util.ArrayList;
import java.util.Arrays;
public class BucketSort {
    public static void main(String[] args) {
        
        float[] data = { 0.79f, 0.13f, 0.64f, 0.72f, 0.20f, 0.25f, 0.17f, 0.45f, 0.56f,0.58f,0.23f,0.68f };
        System.out.println("data = " + Arrays.toString(data));
        
        bucketSort(data, data.length);
        System.out.println("data = " + Arrays.toString(data));
    }

    public static void bucketSort(float[] arr, int n) {
        if (n <= 0)
            return;

        // Create empty buckets
        ArrayList<Float>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        // Add elements into the buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * n;
            // ArrayList<Float> temp = buckets[i];
            int ind = 0;
            if(buckets[bucketIndex].size() == 0){
                buckets[bucketIndex].add(arr[i]);
            }else{
                while (ind < buckets[bucketIndex].size() && arr[i] > buckets[bucketIndex].get(ind)) {
                    ind++;
                }
                buckets[bucketIndex].add(ind, arr[i]);
            }
        }

        // Concatenate all buckets into arr[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }
}
