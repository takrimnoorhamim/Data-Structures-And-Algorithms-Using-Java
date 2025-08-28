// Arrays Practise (Section 2) Part 4
// Trapping Rainwater

/*
Qs: Given n non-negative integers representing an elevation map where the width of each bar is 1,
    compute how much water it can trap after raining.

    tapped water = (waterlevel - barlevel) * width
*/ 

public class JavaArrayTwo4 {
    public static void main(String[] args) {
        
        int arr[] = {4,2,0,6,3,2,5};

        int leftMaxBoundary[] =  new int[arr.length];
        int rightMaxBoundary[] = new int[arr.length];

        leftMaxBoundary[0] = arr[0];
        rightMaxBoundary[arr.length-1] = arr[arr.length-1];

        for(int i = 1; i < arr.length; i++){

            if(leftMaxBoundary[i-1] > arr[i]){

               leftMaxBoundary[i] = leftMaxBoundary[i-1];

            } else{

                leftMaxBoundary[i] = arr[i];

            }

        }

        for(int i = (arr.length-1)-1; i >= 0; i--){

            if(rightMaxBoundary[i+1] > arr[i]){

               rightMaxBoundary[i] = rightMaxBoundary[i+1];

            } else{

                rightMaxBoundary[i] = arr[i];

            }

        }

        System.out.print("Left Max Boundary: ");

        for(int i=0; i<arr.length; i++){
            System.out.print(leftMaxBoundary[i] + " ");
        }

        System.out.println();
        System.out.print("Right Max Boundary: ");

        for(int i=0; i<arr.length; i++){
            System.out.print(rightMaxBoundary[i] + " ");
        }


        int[] tappedWater = new int[arr.length];

     for(int i = 0; i<arr.length; i++){

        if(leftMaxBoundary[i] < rightMaxBoundary[i]){

           tappedWater[i] = (leftMaxBoundary[i] - arr[i]) * 1;

        } else{

              tappedWater[i] = (rightMaxBoundary[i] - arr[i]) * 1;

        }     
 
      }

     System.out.println();
     System.out.print("Tapped Water: ");

     for(int i=0; i<arr.length; i++){

       System.out.print(tappedWater[i] + " ");

    }

    System.out.println();
    int totalTappedWater = 0;

    for(int i = 0; i < arr.length; i++){

        totalTappedWater += tappedWater[i];

    }

    System.out.print("Final Total Tapped Water: " + totalTappedWater);


  }

}