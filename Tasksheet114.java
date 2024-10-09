//Ma. Angela M. Mancera
//Title: Writing Control flow statements using Loops

public class Tasksheet114 {

    public static void main(String[] args) {
        
        int check_number = 10; 
        String message;        

        while(check_number > 0) {
            message = (check_number%2==0) ? check_number + " is even number" : check_number + " is odd number";
            System.out.println(message);
            
            check_number--;
          
        }
    }
}

// Create an int variable and name it check_number with an initial value of 10.
// Create a String variable and name it message.
// Use check_number as a condition on how many loops the program can print.
// Create a loop that will check and print each number if odd or even numbers using this syntax:  message = (i%2==0) ? i+" is even number" : i+" is odd number";
// The next line should print message value.
