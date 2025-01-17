public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int k = arr[i];
            int j = i-1;
            //Move elements of arr[0..i-1] > k, to one position ahead
            while (j>=0 && arr[j]>k){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = k;
        }
    }
}
