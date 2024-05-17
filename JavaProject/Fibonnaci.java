import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the digit ot get the Fibonnaci series:");
        int number = scan.nextInt();
        int a = 0, b = 1, sum = 0;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i <= number; i++) {
            sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }

}
