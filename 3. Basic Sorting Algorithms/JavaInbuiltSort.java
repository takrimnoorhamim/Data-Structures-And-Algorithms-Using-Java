import java.util.*;

public class JavaInbuiltSort {
    public static void main(String[] args) {
        
        int[] arr = {4,7,2,4,5,8,1};

       // Arrays.sort(arr); // sort all , java inbuilt sort function in Arrays Class

        

        Arrays.sort(arr, 0, 4); // sort from 0 to 4 index

        for(int i=0; i<arr.length; i++){

            System.out.print(arr[i] + " ");

        }

        System.out.println();

        Integer arr2[] = {4,2,5,1,3}; // int[] ta holo primitive type ar Integer holo Object type ja Integer class er object

        Arrays.sort(arr2, Collections.reverseOrder()); // reverseOrder() function taobject type array te kaj kore only

        for(int i=0; i<arr.length; i++){

            System.out.print(arr2[i] + " ");

        }

        Arrays.sort(arr2, 0, 4, Collections.reverseOrder()); // start & end index soho
    }
}
