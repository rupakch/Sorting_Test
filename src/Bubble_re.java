
public class Bubble_re {
	void bubbleSort_rec(int arr[], int n)
    {
		 if (n == 1) 
	            return;
        //int n = arr.length;
		 for (int i=0; i<n-1; i++) 
	            if (arr[i] > arr[i+1]) 
	            { 
	                // swap arr[i], arr[i+1] 
	                int temp = arr[i]; 
	                arr[i] = arr[i+1]; 
	                arr[i+1] = temp; 
	            } 
		 bubbleSort_rec(arr, n-1);
    }
 
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        Bubble_re ob = new Bubble_re();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort_rec(arr,arr.length);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

}
