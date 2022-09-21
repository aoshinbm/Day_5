import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        float sum= 0.0F;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number : ");
        int n=sc.nextInt();

 //       while (n!=0) {
            for (int i = 0; i < n; i++) {
                int h=i+1;
                sum = sum + (1 /h);
                System.out.println("Sum of harmonic series: " + sum);
            }
   //     }
    }
}
