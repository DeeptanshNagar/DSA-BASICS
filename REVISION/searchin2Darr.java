import java.util.Arrays;
// Method-1
// public class searchin2Darr {
//     public static void main(String[] args) {
//         int[][] nums = {
//             {33, 23, 43, 61},
//             {18, 21},
//             {102, 542, 242},
//             {12, 6, 7, 2, 11}       
//         };
//         int target = 21;
//         System.out.println(search(nums, target));
//     }
//     static boolean search(int[][] arr, int target) {
//         for (int rows = 0; rows < arr.length; rows++) {
//             for (int col = 0; col < arr[rows].length; col++) {
//                 if(arr[rows][col] == target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

// Method-2 
public class searchin2Darr {
    public static void main(String[] args) {
        int[][] nums = {
            {33, 23, 43, 61},
            {18, 21},
            {102, 542, 242},
            {12, 6, 7, 2, 11}       
        };
        int target = 11;
        int[] ans = search(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target) {
        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col < arr[rows].length; col++) {
                if(arr[rows][col] == target){
                    return new int[]{rows, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}