import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Length of the Rectangle:");
        int Length = scan.nextInt();
        System.out.println("Enter the Breadth of the Rectangle:");
        int Breadth = scan.nextInt();
        int area = Length * Breadth;
        System.out.println("The area of the Rectangle is:" + area);
    }
}
