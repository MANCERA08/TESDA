import java.util.Scanner;

class Tasksheet117 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2= sc.nextInt();
        int input3 = sc.nextInt();
        
        if(input1>input2 && input1>input3) {
            System.out.println(input1);
            System.out.println("The first number is the largest number");
        } else if (input2>input1 && input2>input3) {
            System.out.println(input2);
            System.out.println("The second number is the largest number");
        } else if(input3>input1 && input3>input2) {
            System.out.println(input3);
            System.out.println("The third number is the largest number");
        } else {
            System.out.println("All numbers are equal.");
          }
    }
}
