import java.util.Scanner;

class Tasksheet116 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input String: ");
        String input = sc.nextLine();
        
        String rev_string = new StringBuilder(input).reverse().toString();
        
        System.out.print("Reversed String: ");
        System.out.println(rev_string);
        
        String message = input.equals(rev_string) ? "The input string is a palindrome." : "The input string is not a palindrome.";
        
        System.out.println(message);
    }
}
