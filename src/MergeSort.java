public class MergeSort {
    public static void merge(int[] arr, int start, int mid, int end){
        //Sizes of two subArrays to be merged
        int s1 = mid - start + 1;
        int s2 = end - mid;

        //Temporary arrays
        int[] arrOne = new int[s1];
        int[] arrTwo = new int[s2];

        //Copy data to temporary arrays
        for(int i=0; i<s1; ++i){
            arrOne[i]=arr[start + i];
        }
        for (int j=0; j<s2; ++j){
            arrTwo[j] = arr[mid + 1 + j];
        }

        //Merge temporary arrays
        int i = 0;
        int j = 0;
        int k = start;

        while (i<s1 && j<s2){
            if(arrOne[i] <= arrTwo[j]){
                arr[k] = arrOne[i];
                i++;
            } else {
                arr[k] = arrTwo[j];
                j++;
            }
            k++;
        }
        //Copy remaining elements of first subArray - arrOne
        while (i < s1){
            arr[k] = arrOne[i];
            i++;
            k++;
        }
        //Copy remaining elements of second subArray - arrTwo
        while (j < s2){
            arr[k] = arrTwo[j];
            j++;
            k++;
        }
    }

    //Function that sorts array using merge()
    public static void sort(int[] arr, int start, int end){
        if(start < end){
            //Middle point
            int mid = (start + end) / 2;
            //Sort first and second halves
            sort(arr, start, mid);
            sort(arr, mid + 1, end);
            //Merge sorted halves
            merge(arr, start, mid, end);
        }
    }
}
