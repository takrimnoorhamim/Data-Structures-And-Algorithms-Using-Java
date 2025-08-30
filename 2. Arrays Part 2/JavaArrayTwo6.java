// Arrays Practise (Section 2) Part 6
// Buy & Sell Stock - O(n) Complexity

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different 
day in the future to sell that stock. Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0;
*/ 

import java.util.*;

public class JavaArrayTwo6 {
    public static void main(String[] args) {
        
        int arr[] = {7,1,5,3,6,4};

        
        int maxProfit = 0;
        int buyingPrice = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++){

            if(buyingPrice > arr[i]){

                buyingPrice = arr[i];

            } else{

                maxProfit = Math.max(maxProfit, arr[i] - buyingPrice);

            }
            
        }

        
        System.out.println(maxProfit);
            


        
    }
}