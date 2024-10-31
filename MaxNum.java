public class MaxNum {
    public static void main(String[] args) {
        int [] arr = {23, 35, 56, 128, 256};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1 ,3));
    }

    // imagine that arr is not empty
    static int max(int[] arr) {
        if (arr.length == 0){           // if the arr is empty.
            return -1;
        }
        int maxVal = arr[0];    // if you don't know whether the array is empty then you can take Integer.MIN_VALUE
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // work on edge cases here, like array being null  
    static int maxRange(int[] arr, int start, int end) {

        if (end > start) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int maxVal = arr[start];    // if you don't know whether the array is empty then you can take Integer.MIN_VALUE
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
