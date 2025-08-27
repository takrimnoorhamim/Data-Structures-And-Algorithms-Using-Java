// Arrays Clss 1
// Arrays as Function Argument

public class JavaArray1{

    public static void main (String args[]){


        int marks[] = {1,2,3,4};
        UpdateArray(marks);

    }


    public static void UpdateArray(int marks[]){

        for(int i = 0; i < marks.length; i++){

             marks[i] += 1;

        }

        for(int i = 0; i < marks.length; i++){
        System.out.println(marks[i]);
        }
    }

}