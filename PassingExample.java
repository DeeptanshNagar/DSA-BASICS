// java use pass by value.

public class PassingExample {
    public static void main(String[] args) {
        String name = "Deeptansh Nagar";    // name is reference variable. 
        // copy of the value of reference variable is passed in next step.
        greet(name);                       // value of reference variable is passed.
    }

    static void greet(String naam) {     // naam is the copy of reference variable 'name'.
        System.out.println(naam);
    }


    
}
