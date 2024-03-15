import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {

        // Swapping 2 numbers
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 + " " + num2); // 20 10
        // Extra Container
        int num3;

        num3 = num1; // 10 20 10
        num1 = num2; // 20 20 10
        num2 = num3; // 20 10 10

        System.out.println(num1 + " " + num2); // 20 10


        // Assignment Operator
        int num4 = 12;
//        num4=num4+1; or num4+=1;
        System.out.println(num4); // 13

//        num4= num4/10;  or num4/=10;

        //Arithmetic




        System.out.println(20/10); // 2
        System.out.println(-20/10); // -2
        System.out.println(20/-10); // -2
        System.out.println(-20/-10); // 2

        System.out.println();
        System.out.println(20.0/10); // 2.0
        System.out.println(20/10.0); // 2.0
        System.out.println(-20.0/10); // -2.0
        System.out.println(-20/10.0); // -2.0
        System.out.println(20.0/-10); // -2.0
        System.out.println(20/-10.0); // -2.0
        System.out.println(-20.0/-10); // 2.0
        System.out.println(-20/-10.0); // 2.0
        System.out.println();


//        System.out.println(20/0); // Arithmetic Exception : / by zero
//        System.out.println(0/20); // 0
//        System.out.println(-20/0); // Arithmetic Exception : / by zero
//        System.out.println(0/-20); // 0

//        System.out.println(0/0);
//        System.out.println(0/0.0); // NaN
//        System.out.println(0.0/0.0); // NaN

        // Modulo Operator : Remainder : %


        System.out.println(10/2); // 5
        System.out.println(10 % 2); // 0

        System.out.println(11/2); // 5
        System.out.println(11%2); // 1

        System.out.println(12/3); // 4
        System.out.println(12%3); // 0

        System.out.println(14%5); // 4
        System.out.println(5%5); // 0
        System.out.println(0%5); // 0
//        System.out.println(5%0); // Arith Exc
        System.out.println(1%5); // 1
        System.out.println(5%1); // 0


//        -------------------------------------
        System.out.println();
        System.out.println();
        System.out.println();

// Mini Calculator
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
        System.out.println("My Mini Calculator :");
        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));  // 10 + 20 = 30
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
        System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
        System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
        System.out.println(n1 + " % " + n2 + " = " + (n1%n2));


//        .Create a program to convert Fahrenheit to Celsius : °C = (°F - 32) × 5/9

        System.out.print("Enter a Fahrenheit Degree : ");
        float F = sc.nextFloat();
        float C = (F-32)*(5/9);
        System.out.println(F +"°F = " + C +"°C" );












    }
}
