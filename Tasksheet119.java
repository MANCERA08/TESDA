import java.util.Scanner;

public class Tasksheet119 {
    public static void main(String[] args) {

        Arithmetic arithmetic = new Arithmetic();
    
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers: ");
            arithmetic.setNumbers(sc.nextInt(),sc.nextInt());

            System.out.println("Sum: " + arithmetic.getSum());
            System.out.println("Difference: " + arithmetic.getDifference());
            System.out.println("Product: " + arithmetic.getProduct());
            System.out.println("Quotient: " + arithmetic.getQuotient());
            
        } catch(ArithmeticException e) {
                System.out.println("Error, zero is not allowed");
        }
    }
}
class Arithmetic {
    private int num1;
    private int num2;

public void setNumbers(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
}
public int getSum() {
    return num1 + num2;
}
public int getDifference() {
    return num1 - num2;
}
public int getProduct() {
    return num1 * num2;
}
public int getQuotient() {
    if(num2==0) {
        throw new ArithmeticException("Try new number");
    }
    return num1 / num2;
}
}
