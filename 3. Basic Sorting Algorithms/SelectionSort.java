public class SelectionSort {
    
    public static void main(String[] args) {
        
        int[] arr = {3,4,2,6,1,8};
        SelectionSortAlg(arr);

    }

    public static void SelectionSortAlg (int[] arr){
        
        for(int i = 0; i < arr.length; i++){

            int minValue = i;

            for(int j = i+1; j < arr.length; j++){

                if(arr[j] < arr[minValue]){

                    minValue = j;

                }

            }

            int temp = arr[i];
            arr[i] = arr[minValue];
            arr[minValue] = temp;

        }

        for(int i = 0; i < arr.length; i++){

            System.out.print(arr[i] + " " );

        }

    }

}
