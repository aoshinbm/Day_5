import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        float sum= 0.0F;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number : ");
        int n=sc.nextInt();

        int i=1;
        while (i <=n) {
            int s=1/(i);
            sum = s+sum ;
            System.out.println(sum);
            i++;
        }
    //    System.out.println("Sum of harmonic series is :"+ sum);
    }
}
