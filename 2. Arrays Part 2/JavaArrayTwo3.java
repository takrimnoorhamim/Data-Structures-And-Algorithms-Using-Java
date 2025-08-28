// Arrays Practise (Section 2) Part 3
// Max SubArray Sum - 3 (Kadan's Algorithm)

public class JavaArrayTwo3 {
    public static void main(String[] args) {
        
        int arr[] = {1,-2,6,-1,3};
        KadanSubarraySum(arr);

    }

    public static void KadanSubarraySum (int[] arr){

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;


        for(int i = 0; i < arr.length; i++){

            currentSum += arr[i];
            
            if(currentSum<0){
                currentSum = 0;
            }

            if(currentSum > maxSum){
                maxSum = currentSum;
            }

        }

        System.out.println(maxSum);


    }


}


// Complexity O(n)