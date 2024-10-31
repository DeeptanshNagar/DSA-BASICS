import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        /* 
        
            1 2 3
            4 5 6
            7 8 9   

        */

        // int[][] arr = new int[3][]; //Adding rows are mandatory but columns aren't mandatory.!

        // int[][] arr = {
        //     {1, 2, 3},    // 0
        //     {4, 5, 6},    // 1
        //     {7, 8, 9}     // 2
        //     // Imagine this as an array of arrays.
        // };

        Scanner in = new Scanner(System.in);

        // int[][] arr = new int[3][];

        // int[][] arr = {
        //     {1, 2, 3},       // 0th index
        //     {4, 5},          // 1st index
        //     {6, 7, 8, 9}     // 2nd index  -> arr2D[2] = {6, 7, 8, 9}
        // };
        // 2D Array can be of this type also, Hence, Mentioning Columns is not necessary.


        int[][] arr = new int [3][3];
        System.out.println(arr.length);  // no of rows

        // input 

        for (int row = 0; row < arr.length; row++){
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        // output
        // for (int row = 0; row < arr.length; row++){
        //     // for each col in every row
        //     for (int col = 0; col < arr[row].length; col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // output
        // for (int row = 0; row < arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }


        // Using Enhanced For Loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}

