public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // System.out.println(num);     // can't access outside the func.
        //System.out.println(marks);    // can't access outside the func.


        {
            // int a = 78;                // already initialised outside the block in the same method, hence you cannot intialise again
            a = 100; // but you can change the value. // reassign the original ref variable to some other value.
            System.out.println(a);        // 100
            int c = 99;
            // values initialised in this block, will remain in block.
        }

        System.out.println(a);            // 100
        int c = 900;
        // System.out.println(c);         // cannot use outside the block.

        // ++++ MEANS OVER ALL SUMMARY IS ++++
        // 1. THE VARIABLE WHICH IS INITIALIZED OUTSIDE THE BLOCK, THEN THE SAME VARIABLE CAN NOT BE INTIALIZED INSIDE THE BLOCK OF SCOPE BUT WE CAN UPDATE/CHANGE THE VALUE OF THAT VARIABLE INSIDE THE BLOCK OF SCOPE AND AFTER UPDATION WE CAN PRINT THE UPDATED VALUE OUTSIDE THE BLOCK OF SCOPE.

        // 2. A VARIABLE WHICH IS INITIALIZED INSIDE THE BLOCK OF SCOPE, THEN THE SAME VARIABLE CAN ALSO BE INITIALIZED AGAIN OUTSIDE THE BLOCK OF SCOPE BUT YOU CAN'T USE THAT VARIABLE OUTSIDE THE BLOCK OF SCOPE. ;)

        // Scoping in loops 
        for (int i = 0; i < 4; i++) {
            // System.out.println(i);
            int num = 90;
            a = 10000;
        }
        System.out.println(a);


    }

    // scope means you can access the variable inside that function only, you can't access the same variable outside the function body.
    static void random(int marks) {
        int num = 67;
        System.out.println(num);      // can access inside the func.
        System.out.println(marks);    // can access inside the func.
    }
}
