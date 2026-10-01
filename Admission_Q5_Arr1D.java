import java.util.*;
public class Admission_Q5_Arr1D
 {
    // Data member to store 100 admission numbers
    private int[] Adno;

    // Constructor to initialize the array elements
    public Admission_Q5_Arr1D() {
        Adno = new int[100];
    }

    // Method to accept the elements of the array in ascending order
    public void fillArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 100 admission numbers in ascending order:");
        for (int i = 0; i < Adno.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            Adno[i] = sc.nextInt();
        }
    }

    // Recursive binary search method to find admission number 'v'
    public int binSearch(int l, int u, int v) {
        // Base case: if lower bound exceeds upper bound, element is not present
        if (l > u) {
            return -1;
        }

        // Calculate the middle index
        int mid = l + (u - l) / 2;

        // Check if the element is present at the middle
        if (Adno[mid] == v) {
            return 1;
        }

        // If element is smaller than mid, search in left subarray
        if (Adno[mid] > v) {
            return binSearch(l, mid - 1, v);
        }

        // Otherwise, search in right subarray
        return binSearch(mid + 1, u, v);
    }

    // Main function to execute the class tasks
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create an object of Admission class
        Admission_Q5_Arr1D obj = new Admission_Q5_Arr1D();

        // Fill the array with user inputs
        obj.fillArray();

        // Accept the search value from user
        System.out.print("\nEnter the admission number to search: ");
        int searchVal = sc.nextInt();

        // Perform recursive binary search
        // Lower index = 0, Upper index = 99 (since array size is 100)
        int result = obj.binSearch(0, 99, searchVal);

        // Display the result
        if (result == 1) {
            System.out.println("Admission number " + searchVal + " found in the records.");
        } else {
            System.out.println("Admission number " + searchVal + " NOT found in the records.");
        }
    }
}
