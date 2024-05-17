import java.util.Scanner;

public class Intrest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Principal Amount:");
        int P = scan.nextInt();
        System.out.println("Enter the Rate of Intrest:");
        int R = scan.nextInt();
        System.out.println("Enter the Time Period:");
        int T = scan.nextInt();
        int SI = (P * T * R) / 100;
        System.out.println("The Simple Intrest is:" + SI);
    }
}
