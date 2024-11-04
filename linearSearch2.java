public class linearSearch2 {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 199;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    /*
        Search in the array: return the index if item found
        otherwise if item not found return -1
     */
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // Run a for loop
        for (int index = 0; index < arr.length; index++) {
            // Check for element at every index if it is equal to target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        // this line will execute if none of the return statements above have executed, hence the target not found 
        return -1;
    }

    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // Run a for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        // this line will execute if none of the return statements above have executed, hence the target not found 
        return false;
    }

    // search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // Run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        // this line will execute if none of the return statements above have executed, hence the target not found 
        return Integer.MAX_VALUE;
    }
}
