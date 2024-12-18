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

        String name = "Kunal Kushwaha";        // name is reference variable. 
        // copy of the value of reference variable is passed in next step.
        changeName(name);                     // value of reference variable is passed.
        System.out.println(name);
    }

    static void changeName(String naam) {     // naam is the scope of the function means naam is only accessible in the function body only.
        naam = "Rahul Rana";                 // not changing, creating a new object rahul rana and naam is pointing to that object.
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
