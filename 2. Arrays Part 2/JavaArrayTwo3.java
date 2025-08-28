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

            if(currentSum > maxSum){
                maxSum = currentSum;
            }

            if(currentSum<0){
                currentSum = 0;
            }

            // ekhaner last 2 ta if er vetor serial maintain korte hobe, 2nd if ta age dewa jabe na
            // karon amader emon array o thakte pare jekhane sob negative numbers sekhane ki korbe?

        }

        System.out.println(maxSum);


    }


}


// Complexity O(n)