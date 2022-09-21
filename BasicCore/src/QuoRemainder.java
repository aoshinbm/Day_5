import java.util.Scanner;

public class QuoRemainder {
    public static void main(String[] args) {
        int n1,n2;
        float q,rem;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number1 : ");
        n1=sc.nextInt();

        System.out.println("Enter number2 : ");
        n2=sc.nextInt();

        q=n1/n2;
        System.out.println("Quotient is : " +q);

        rem=n1%n2;
        System.out.println("Remainder is : "+rem);
    }
}
