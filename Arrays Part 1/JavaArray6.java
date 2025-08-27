// Arrays Practise 4
// Pairs in an Array


public class JavaArray6 {
    public static void main(String[] args) {
        
        int arr[] = {2,4,6,8,10};
        PairArray(arr);

    }

    public static void PairArray (int arr[]){

        int totalPairs = 0;

        for (int i = 0; i < arr.length; i++){

            for (int j = i + 1; j < arr.length; j++){

                System.out.print("(" + arr[i] + "," + arr[j] + ")" + " ");

                totalPairs++;

            }

            System.out.println();

        }

        System.out.println("Total Pairs: " + totalPairs);

    }

}
