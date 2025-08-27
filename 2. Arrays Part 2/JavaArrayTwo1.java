// Arrays Practise (Section 2) Part 1
// Max Sub Array Sum - 1 (Brute Force)

public class JavaArrayTwo1{

    public static void main (String args[]){

        int arr[] = {1,-2,6,-1,3};

        MaxSubarraySum(arr);

    }

    public static void MaxSubarraySum (int arr[]){

        int maxSum = Integer.MIN_VALUE;


        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length; j++) {

                int currentSum = 0;

                for(int k=i; k<=j; k++){

                    System.out.print(arr[k] + " ");
                    currentSum += arr[k];
                }

                if(currentSum > maxSum){
                    maxSum = currentSum;
                }

                System.out.println();

            }

            System.out.println();

        }

        System.out.println("Max Sum: " + maxSum);

    }


}

// Time Complexity O(n^3)