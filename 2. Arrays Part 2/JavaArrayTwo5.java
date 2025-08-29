// Arrays Practise (Section 2) Part 5
// Buy & Sell Stock (Brute Force)

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different 
day in the future to sell that stock. Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0;
*/ 

public class JavaArrayTwo5 {
    public static void main(String[] args) {
        
        int arr[] = {7,1,5,3,6,4};

        int maxProfit = 0;

        for (int i = 0; i<arr.length; i++){

            for(int j = i+1; j<arr.length; j++){

               if((arr[j] - arr[i])>maxProfit) {
                    maxProfit = arr[j] - arr[i];
               }

            }

        }

        
        System.out.println(maxProfit);
            


        
    }
}