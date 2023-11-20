import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter the power of N");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int power=0 ; power < N ;power++){
            long result = (long) Math.pow(2,power);
            System.out.println(" Power of 2^" + power + " is: "  + result);
        }
    }
}
