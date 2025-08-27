// Arrays Practise (Section 2) Part 2
// Max Sub Array Sum - 2 (Prefix Sum)

public class JavaArrayTwo2 {
    public static void main(String[] args) {
        
        int arr[] = {1,-2,6,-1,3};
        PrefixSumArray(arr);

    }

    public static void PrefixSumArray(int[] arr){

        int[] prefixArray = new int[arr.length];

        prefixArray[0] = arr[0];

        for (int i=1; i<arr.length; i++){

            prefixArray[i] = prefixArray[i-1] + arr[i]; 

        }

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        

        for(int i=0; i<arr.length; i++){

            for(int j=i; j<arr.length; j++){



                if (i==0){
                    currentSum = prefixArray[j]; // remember? i=0 er ta agei sajaye kor ase, so just j ta marlei hoy
                } else{

                    currentSum = prefixArray[j] - prefixArray[i-1];

                }

                if(currentSum > maxSum){

                    maxSum = currentSum;

                }
                

            }

        }

        System.out.println(maxSum);


    }

}


// Complexity O(n^2)