public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23,223,42,12,3,4,52,-9-112,55,334,2,1};
        int target = 52;

        int ans = linearSearch(arr, target);
        System.out.println(ans);

    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        return -1;
    }
}
