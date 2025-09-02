public class CountingSort {
    public static void main(String[] args) {
        
         int arr[] = {3,1,5,7,8,2, 2, 2};
         int maxValue = Integer.MIN_VALUE;

         for(int i = 0; i < arr.length; i++){

            maxValue = Math.max(maxValue, arr[i] );

         }

         int arr2[] = new int[maxValue+1];

         for(int i=0; i<arr.length; i++){

            arr2[arr[i]] += 1;

         }


         int index = 0;
         
         for(int i=0; i<arr2.length; i++){


            while (arr2[i]>0) {
               
               arr[index] = i;
               arr2[i]--;
               index++;

            }

         }

         for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
         }

    }
}
 