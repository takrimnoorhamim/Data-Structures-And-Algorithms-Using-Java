// Arrays Practise 5
// Reverse an Array

public class JavaArray5 {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,8,9};
        ReverseArray(arr);

    }

    public static void ReverseArray(int arr[]){


        int first = 0;
        int last = arr.length - 1;
        

        while (first < last){
           
            int temp = arr[first];

            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;

        }


        for(int i = 0; i < arr.length; i++){

          System.out.print(arr[i] + " ");

        }

    }
}


// Using 'first < last':
// - The loop runs only while 'first' is strictly less than 'last'.
// - In an odd-length array, the middle element is not swapped with itself,
//   because swapping it with itself is unnecessary.
// - Example: {1,2,3,4,5} → swaps (1,5) and (2,4), leaving 3 (middle) untouched.

// Using 'first <= last':
// - The loop runs while 'first' is less than or equal to 'last'.
// - In an odd-length array, the middle element will be swapped with itself.
//   This doesn't change the value, so it is safe, but it is an unnecessary swap.
