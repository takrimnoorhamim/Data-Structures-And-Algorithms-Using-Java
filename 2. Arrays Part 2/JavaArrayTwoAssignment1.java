/*
Given an integer array nums, return true if any value appears at least twice in the 
array, and return false if every element is distinct.
 */

public class JavaArrayTwoAssignment1 {
    
    public static void main(String[] args) {
        
       int[] nums = {1, 2, 3, 2};

       System.out.println(duplicateChecker(nums));

    }

    public static boolean duplicateChecker (int arr[]){

        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length; j++){

                if(arr[i] == arr[j]){
                    return true;
                }

            }

        }

        return false;

    }

}
