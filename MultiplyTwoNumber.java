import java.util.Scanner;

public class MultiplyTwoNumber {
    public static int Multiply(int a, int b) {
    
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int result  = a * b;
        System.out.println("Multiply of 2 number: "+ a * b);
        sc.close();
    }
    
}
