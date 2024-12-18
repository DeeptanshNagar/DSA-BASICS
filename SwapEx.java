public class SwapEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
        // int temp = a;
        // a = b;
        // b = temp;

        swap(a, b);
        System.out.println(a + " " + b);

        String name = "Kunal Kushwaha";         // name is reference variable. 
                                               // copy of the value of reference variable is passed in next step.
        changeName(name);                     // value of reference variable is passed.
        System.out.println(name);
    }

    static void changeName(String naam) {      // naam is the scope of the function means naam is only available in the function body only.
                                              // can't access naam and its value from outside the function body.this is known as scoping.
        naam = "Rahul Rana";                 // not changing, creating a new object rahul rana and naam is pointing to that object.
                                            // we can't modify strings or change strings cause they are immutable in nature tho.
    }

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // this change will only be valid in this function scope only.
    }
}
