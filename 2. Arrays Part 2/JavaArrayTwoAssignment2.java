/*
There is an integer array nums sorted in ascending order (with distinct values). 
Prior to being passed to your function, nums is possibly rotated at an unknown 
pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], 
nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For 
example, [0,1,2,4,5,6,7] might be rotated
 at pivot index 3 and 
become [4,5,6,7,0,1,2]. 
Given the array nums after the possible rotation and an integer target, return the 
index of target if it is in nums, or -1 if it is not in nums. 
You must write an algorithm with O(log n) runtime complexity.
 */

public class JavaArrayTwoAssignment2 {
    
    public static void main(String[] args) {
        
       int[] arr = {4, 5, 6, 7, 0, 1, 2};
       int target = 0;

       System.out.println(ReturnIndex(arr,target));

    }

    public static int ReturnIndex(int arr[], int target) {
       int start = 0;
       int end = arr.length-1;

       while(start<=end){

            int mid = (start + end)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] >= arr[start]){

                // tahole amader bam side sorted, ekhon bam side sorted hole check korbo target ase kina

                if(target >= arr[start] && target < arr[mid]){
                
                    end = mid - 1;

                } else{

                    //ekhon target jodi sorted er vetor na thake tahole

                    start = mid + 1;

                }

            } else{

                // ekhane ashar mane holo array bam pashe sorted na tahole dan pashe sorted

                if( target <= arr[end] && target > arr[mid]){

                    start = mid + 1;

                } else{

                    end = mid - 1;

                }

            }

       }

       return -1;
    }

  }

