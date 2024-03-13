import java.util.Scanner;


public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1
        int one = 1;
        char one1 = '1'; // single quotes
        short a = 123;
        long b = 123L; // L
        float c = 12.2f; //f
        double d = 12.345d; //d
        int int_ = 1;

        boolean isEligible = true;
//        is_eligible_candidate - snake case
//        isEligibleCandidate - camel case


//        System.out.println();
//        float f = 12.345f;
//        System.out.printf("h = "+"%.2f" +"dd"+ "%.1f",f,f);

        float f1 = 1.2e3f;
        System.out.println(f1/2); // 600.0
        System.out.println(1200/2); //600

//        120 => 120.0*10^0 => 12.0*10^1 => 1.20 * 10^2 => 0.120 * 10^3 => 0.12*10^3
// 1.2 * 10^-1 = 1.2e-1
        System.out.println("\thelloworld"); //'    helloworld'

//        System.out.println(""helloworld""); //"helloworld"
        System.out.println("\"helloworld\""); //"helloworld"
        System.out.println("'helloworld'"); //'helloworld'
        System.out.println("\\helloworld\\"); //  \helloworld\


        float x = 1.234f; //1.234
        System.out.println("x - " + x);
        double z = x; //-> Implicit
        System.out.println("z - " + z); // 1.2339999675750732 - Widening
//        int y = x;
        int y = (int)x; //-> Explicit
        System.out.println(y); //1 -> Narrowing


        int a1 = 12;
        float  a2 = 12.45f;
        System.out.println(a2); // 12.45
        a2 = a1;
        System.out.println(a2); // 12.0



    }



}
