public class Main {
    public static void main(String [] args){
        // Q: Store a Roll number 
        int a = 19;

        // Q: Store a Person's Name
        String name = "Deeptansh";

        // Q: Store 5 Roll numbers
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 18;

        // syntax
        // datatype[] variable_name = new datatype[size]; 
        // store 5 roll numbers: 
        // int[] rnos = new int[5];
        // // or directly
        // int[] rnos2 = {23, 12, 45, 32, 15};

        int[] ros; // declaration of array. ros is getting defined in the stack 
        ros = new int[5]; // intialisation: actually here object is being created in the memory (heap)

        // System.out.println(ros[1]);     // [0, 0, 0, 0, 0] this will store like this in heap memory.!

        String[] arr = new String[4];
        System.out.println(arr[3]);        // Returns null which is a special Literal.
        
        // String str = null; //allowed.
        // int num = null; //not allowed. // null is equivalent to none in python.


        // for(String element : arr){         // Enhanced For Loop
        //     System.out.println(element);
        // }

        String str = null;  // We can assign it to non-primitive.
        //int num = null;  // This will throw error coz we can't assign null value to a primitive.



    }
}