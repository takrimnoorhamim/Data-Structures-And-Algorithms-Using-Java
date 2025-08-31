public class BubbleSort {
    
    public static void main(String[] args) {
        
        int[] arr = {3,4,2,6,1,8};
        BubbleSortAlg(arr);

    }

    public static void BubbleSortAlg (int[] arr){
        
        for(int i = 0; i < arr.length; i++){

            for(int j = arr.length - 1; j > i; j--){

                if(arr[j] < arr[j-1]){

                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                }

            }

        }

        for(int i = 0; i < arr.length; i++){

            System.out.print(arr[i] + " " );

        }

    }

}
