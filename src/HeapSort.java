public class HeapSort {
    public static void heapify(int[] arr, int size, int index){
        int largest = index; //root
        int left = (2 * index) + 1;
        int right = (2 * index) + 2;

        if (left < size && arr[left] > arr[largest])
            largest = left;

        if (right < size && arr[right] > arr[largest])
            largest = right;

        //If largest is not root
        if(largest != index){
            int swap = arr[index];
            arr[index] = arr[largest];
            arr[largest] = swap;
            //recursive heapify
            heapify(arr, size, largest);
        }
    }
    public static void sort(int[] arr){
        int size = arr.length;
        //Build heap
        for (int i=size / 2 - 1; i >= 0; i--){
            heapify(arr, size, i);
        }
        //extract elements from heap
        for(int i=size-1; i>0; i--){
            //move root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            //call heapify on the reduced heap
            heapify(arr,i,0);
        }
    }
}
