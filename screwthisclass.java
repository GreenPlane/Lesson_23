import java.util.Scanner;

public class Main {
   public static void main (String[] args){
       Scanner scan = new Scanner (System.in);

       int [] list = new int[10];
       int i = 0;
       int min = 0;
       int max = 0;
       int counter = 0;

       //creates the random numbers in the array
       for (i = 0; i < 10; i++){
           list[i] = (int) (Math.random() * 201 - 100);
       }

       //
       for (i = 0; i < 10; i++) {
           System.out.println(list[i]);

           //Creates the first time condition (comparing the 2nd number and 1st number in the array).
           if (i == 0) { //initial condition
               if (list[i + 1] < list[i]) { //if list[1] < list[0], then call it the min.
                   min = list[i + 1];
               }
               if (list[i+1] > list[i]) { //if list[1] > list[0], then call it the max.
                   max = list[i + 1];
               }
           }

           //only applies when the index is greater than 0, which will update the min and max.
           if (i > 0){ //all other conditions to list[9]
               if (list[i] > max){ //if the index number contains a greater number than the original max from the initial condition, then it will update that number, until the end.
                   max = list[i];
               }
               if (list[i] < min){ //if the index number contains a smaller number than the original min from the initial condition, then it will update that number, until the end.
                   min = list[i];
               }
           }
       }

       //counts the number of positive integers in the array.
       for (i = 0; i < 10; i++){
           if (list[i] >= 0){
               counter++;
           }
       }
       System.out.println("\nThe min of this array is " + min + ".");
       System.out.println("The max of this array is " + max + ".");
       
       System.out.println("\nThere are " + counter + " positive integers in this randomly generated array.");
   }
}
