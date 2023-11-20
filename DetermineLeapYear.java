import java.util.Scanner;

public class DetermineLeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year of your choice");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(String.valueOf(year).length()==4){
            if(year%4 == 0 && (year%400 == 0 || year%100 != 0)){
                System.out.println(year + " is a leap Year");
            }else {
                System.out.println(year + " is a not a leap Year");
            }
        }else{
            System.out.println("Invalid Input");
        }
    }
}
