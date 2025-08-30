/*
Given an integer array nums, return all the triplets [nums[i], nums[j],   
nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0. 
Notice that the solution set must not contain duplicate triplets. 

 - Brute Force Method O(n^3)
 */

import java.util.Arrays;

public class JavaArrayTwoAssignment3 {
    
    public static void main(String[] args) {
        
       int[] arr = {2,0,1,-1,-4, 4, -1, -2, -1, 3 };

       Arrays.sort(arr);
      // arr after sort : -4, -2, -1, -1, -1, 0, 1, 2, 3, 4


       for(int i = 0; i < arr.length; i++){

        if(i>0 && arr[i] == arr[i-1]) continue; //skipping i duplicates

            for(int j = i+1; j < arr.length; j++){

                if(j>i+1 && arr[j] == arr[j-1]) continue; //skipping j duplicates

                for(int k = j+1; k < arr.length; k++){
                   
                    if(k>j+1 && arr[k] == arr[k-1]) continue; //skipping k duplicates

                    if(arr[i] + arr[j] + arr[k] == 0){

                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);

                    }

                }

            }

       }


    }

  }


  /*
যে আউটপুটে দুটো ট্রিপলেট দেখা যাচ্ছে:

-1 -1 2

-1 0 1

দুটোতেই i-এর মান একই — মানে arr[i] হলো প্রথম -1 (index 1)।

শুধু পার্থক্য হলো:

প্রথমটায় j আর k হলো index 2 আর 5।

দ্বিতীয়টায় j আর k হলো index 3 আর 4।

তাই একই -1 দিয়ে শুরু হলেও, আলাদা আলাদা কম্বিনেশন হচ্ছে, এজন্য duplicate নয় — আলাদা triplet হিসেবে প্রিন্ট হচ্ছে।
   */

