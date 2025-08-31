public class InsertionSort {
    
    public static void main(String[] args) {
        
        int[] arr = {3,4,2,6,1,8};
        InsertionSortAlg(arr);

    }

    public static void InsertionSortAlg (int[] arr){
        
        for(int i=1; i<arr.length; i++){

            int temp = arr[i];
            int j = i-1;

            while (j>=0 && temp < arr[j]) { // arr[i] na dea temp dite hobe karon i er value er jaygay notun pasher value bosbe
                arr[j+1] =  arr[j]; // protibar j+1 array er value er sathe tar bam pasher value swap korsi niche j-- dea bam e jassi
                j--;
            }

            arr[j+1] = temp;
            
       }

       for(int i = 0; i<arr.length; i++){

            System.out.print(arr[i] + " ");

       }

     }

}
