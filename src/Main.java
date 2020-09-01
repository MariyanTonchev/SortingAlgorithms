public class Main {

    public static void main(String[] args) {
	    int[] arr = {2,3,1,5,10,200,33};
	    HeapSort.sort(arr);
	    printArray(arr);
    }

    public static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}
