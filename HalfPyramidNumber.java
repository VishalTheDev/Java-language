public class HalfPyramidNumber {
    public static void main(String[] args) {
        // int n = 5;
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println(" ");
        // }
        //Inverted half pyramid numbers
        // int n = 5;
        // //outer loop
        // for(int i=1; i<=n; i++) {
        //     //inner loop
        //     for(int j=1; j<=n-i+1; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //floyod's triangle
        // int n = 5;
        // int number = 1;
        // for(int i=1; i<=n; i++) {  //outer loop
        //     for(int j=1; j<=i; j++) {  //inner loop
        //         System.out.print(number+" ");
        //         number++;  //number = number + 1
        //     }
        //     System.out.println();
        // }

        
        int n = 5;
        for(int i=1; i<=n; i++) { //outer loop
            for(int j=1; j<=i; j++) {  //inner loop
                int sum = i+j;
                if(sum % 2 == 0) {  // even
                    System.out.print("1 ");
                } else {     // odd
                    System.out.print("0 ");
                }
            }
            System.out.println(); 
        }
    }
}

