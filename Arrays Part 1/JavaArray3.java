// Arrays Practise 3
// Largest number of an Array

public class JavaArray3{

    public static void main (String args[]){

        int marks[] = {23,41,54,23,14};

        Largest(marks);
    }

    public static void Largest(int marks[]){

        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < marks.length; i++){

            if(marks[i] > largest){
                largest = marks[i];
            }

        }

        System.out.println("Largest: " + largest);

    }


}