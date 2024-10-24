import java.util.Scanner;

public class Tasksheet120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Arithmetic ar = new Arithmetic();

        System.out.println("Enter three numbers:");
        int[] num = ar.cumulative_sum(sc.nextInt(), sc.nextInt(),sc.nextInt());

        for(int sum: num){
            System.out.println("Cumulative sum: " + sum);
        }
        int totalSum = 0;
        for (int sum : num) {
            totalSum += sum; 
        }
        System.out.println("Total sum of cumulative sums is: " + totalSum); 
        sc.close();
    }
}
class Arithmetic {
    public int[] cumulative_sum(int... args) {

        int[] sum_of_sum = new int[args.length];
        
        for(int i=0; i<args.length; i++) {
            int sum = 0;
            for(int j=1; j<=args[i]; j++) {
                sum += j;
            }
            sum_of_sum[i] = sum;
        }
        return sum_of_sum;
    }
}
