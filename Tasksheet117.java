import java.util.Scanner;

public class Tasksheet117 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num_count = 3;
        int[] num_store = new int[num_count];

        for(int i=0; i<num_count;  i++) {
            num_store[i] =sc.nextInt();
        }

        int large_num = num_store[0];
        boolean equal_num = true;

        for(int i=1; i<num_store.length; i++) {
            if(num_store[i]>large_num) {
                large_num = num_store[i];
                equal_num = false;
            } else if(num_store[i]!=large_num) {
                equal_num = false;
            }
        }

        if (equal_num) {
            System.out.println("All numbers are the same");
        } else {
            System.out.println("The largest number is: " + large_num);
        }
    }
}
