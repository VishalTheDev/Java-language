import java.util.Scanner;

public class CircleCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        //calculation
        double area = Math.PI * radius * radius;
        //output
        System.out.println("Radius of the circle: " + radius);
        System.out.println("Area of the circle: " + area);

        sc.close();


    }
    
}
