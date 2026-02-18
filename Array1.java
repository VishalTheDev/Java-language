import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        //int marks[] = {97, 98, 95};
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        //output
        for(int i=0; i<size; i++) {
            System.out.println(numbers[i]);
        }
    }
    
}
