import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };
        int target = 56;
        int[] ans = search(arr,target); // format of return value {row, column}.
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(min(arr));
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
    }

    static int[] search(int[][] arr, int target) {
         for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
           for (int col = 0; col < arr[row].length; col++) {
               if (arr[row][col] > max) {
                   max = arr[row][col];
               }
           }
       }
       return max;
   }

   static int min(int[][] arr) {
    int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
           for (int col = 0; col < arr[row].length; col++) {
               if (arr[row][col] < min) {
                   min = arr[row][col];
               }
           }
       }
       return min;
   }
}
