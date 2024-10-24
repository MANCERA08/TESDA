import java.util.Scanner;
import static java.lang.Math.*;

public class Tasksheet121 {

    public static int add(int a, int b) {
        return addExact(a,b);
    }
    public static int subtract(int a, int b) {
        return subtractExact(a,b);
    }
    public static int multiply(int a, int b) {
        return multiplyExact(a,b);
    }
    public static float divide(int a, int b) {
       return floorDiv(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers for addition");
        System.out.println("Sum: " + add(sc.nextInt(), sc.nextInt()));
        
        System.out.println("Enter two numbers for subtraction");
        System.out.println("Difference: " + subtract(sc.nextInt(), sc.nextInt()));

        System.out.println("Enter two numbers for multiplication");
        System.out.println("Product: " + multiply(sc.nextInt(), sc.nextInt()));
 
        System.out.println("Enter two numbers for division");
        int div_1 = sc.nextInt();
        int div_2 = sc.nextInt();
        
        if(div_2 == 0) {
            System.out.println("Zero is not allowed for division");
        } else {
            System.out.println("Quotient: " + divide(div_1,div_2));
        }
        sc.close();
    }
}
