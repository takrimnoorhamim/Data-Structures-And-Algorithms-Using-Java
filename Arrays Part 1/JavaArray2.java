// Arrays Practise 1
// Linear Searcing Index From Array Elements

public class JavaArray2{

    public static void main (String args[]){

        int targetedMark = 14;

        int marks[] = {23,41,54,23,14};

        int index = search(marks, targetedMark);
        if(index == -1){
            System.out.println("Array doesn't have this");
        } else{
            System.out.println("index: " + index);
        }


    }

    public static int search(int marks[], int targetedMark){

        for(int i = 0; i<marks.length; i++){

            if (marks[i] == targetedMark){
                return i;
            }

        }
        
        return -1; 
    }

}