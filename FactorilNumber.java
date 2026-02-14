import java.util.Scanner;

public class FactorilNumber {
    public static void printFactorialNumber(int n) {
        //loop
        if(n < 0) {
            System.out.print("Invalid number");
            return;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Enter the factorial number: ");
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorialNumber(n);

        sc.close();
    }
    
}
