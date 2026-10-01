import java.util.*;
public class Q4_Arr1D
     {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        
        // Print original array
        System.out.print("Original Array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Inline Bubble Sort logic
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // Exit early if already sorted
            if (!swapped) {
                break;
            }
        }

        // Print sorted array
        System.out.print("Sorted Array:   ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
