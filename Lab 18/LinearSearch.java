public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,9,15,18,22,26,29,31};
        int key = 9;
        LinearSearch b1 = new LinearSearch();
        int ind = b1.linear_search(arr, key);
        System.out.println("key = " + key + " ind  = " + ind);
    } 
      
    public int linear_search(int[] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        
        return -1;
    }
}
