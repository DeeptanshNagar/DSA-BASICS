import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }

    // return the value
    static int sum2() {               // when you want to return a integer or any other dataType from the function body we use int or other dataTypes in func defination.
        Scanner in = new Scanner(System.in); 
        int num1, num2, sum;
        System.out.println("Enter number 1: ");
        num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;                     // function will be like khtm tata bye bye!!

        // System.out.println("This will never execute"); // unreachable statement because return is used earlier.
    }

    static void sum () {                                      // when you want to return nothing from the function body we use void in function defination.
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter number 1: ");
        num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }

    /*
     
    access modifer (we'll look in OOP) return_type name () {
        //body
        return statement;
    }

     */
}
