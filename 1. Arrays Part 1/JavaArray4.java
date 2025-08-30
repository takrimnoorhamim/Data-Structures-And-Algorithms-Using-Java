// Arrays Practise 4
// Binary Search

public class JavaArray4{

    public static void main (String args[]){

        int arr[] = {2,4,6,7,8,16,19};

        BinarySearch(arr, 16);

    }

    public static void BinarySearch (int arr[], int key){

        int start = 0;
        int end = arr.length - 1;


        while (start <= end){
            
            // Update mid every iteration
            // int mid = (start + end)/2; // not optimized
            int mid = start - (end-start)/2;
            
            
            if (arr[mid] == key) {
                System.out.println("Index: " + mid);
                return;
            }
            else if (arr[mid] > key) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }
        
    }

}

/*

Binary search cuts the array in half in every step.

Example: n = 16 elements

Step 1 → 16 → 8

Step 2 → 8 → 4

Step 3 → 4 → 2

Step 4 → 2 → 1

It took 4 steps → and log₂(16) = 4.



Think of it like this:

How many times can you divide n by 2 until you get 1?

That number = log₂(n)


Time Complexity of this code = O(log n) / log₂(n)

*/