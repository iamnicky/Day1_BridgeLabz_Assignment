import java.util.Random;
import java.util.Scanner;

public class FlipTheCoin {
    public static void main(String[] args) {
        System.out.println("Hey! Please input number of times you want to flip the coin");
        Scanner sc=new Scanner(System.in);
        int noOfCoinFlip = sc.nextInt();
        int tailsCount = 0;
        int headsCount = 0;
        for(int flip=1;flip<=noOfCoinFlip;flip++){

            Random random = new Random();
            double result = (double) Math.round(random.nextFloat()*10)/10;
            if(result < 0.5){
                tailsCount++;
            }else {
                headsCount++;
            }
        }

        System.out.println("Percentage of tails: " + (tailsCount / (double) noOfCoinFlip)*100 + " % ");
        System.out.println("Percentage of heads: " + (headsCount / (double) noOfCoinFlip)*100 + " % ");
    }
}
