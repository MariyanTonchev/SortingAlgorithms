public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i <= n-1; i++) {
            //Find minimum element
            int min_index = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            //Swap minimum element with the first
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
}
