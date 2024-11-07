import java.util.InputMismatchException;
 import java.util.Scanner;
 
 public class Tasksheet130 {
     public static void main(String[] args) {
         Division div = new Division();
         
         try (Scanner sc = new Scanner(System.in)) {
             System.out.print("Enter the first number: ");
             div.setNum1(sc.nextInt());
             
             System.out.print("Enter the second number: ");
             div.setNum2(sc.nextInt());
             
             System.out.println("Result: " + div.getQuotient());

         } catch (InputMismatchException e) {
             System.out.println("Error: Please enter a valid integer.");
         } catch (ArithmeticException e) {
             System.out.println("Error: Cannot divide by zero!");
         } catch (Exception e) {
             System.out.println("An unexpected exceptions occurred." + e.getMessage());
         }
     }
 }
 
 class Division {
     private int num1;
     private int num2;
 
     public void setNum1(int num1) {
         this.num1 = num1;
     }
 
     public void setNum2(int num2) {
         this.num2 = num2;
     }
 
     public int getQuotient() {
         if (num2 == 0) {
             throw new ArithmeticException("Error: Cannot divide by zero!");
         }
         return num1 / num2;
     }
 }
