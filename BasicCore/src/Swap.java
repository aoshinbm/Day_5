import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int n1,n2,temp;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number1 : ");
        n1=sc.nextInt();

        System.out.println("Enter number2 : ");
        n2=sc.nextInt();

        System.out.println("Before swapping numbers are " +n1+ " , "+n2);

        temp=n1;
        n1=n2;
        n2=temp;

        System.out.println("After swapping numbers are "+n1+ " , "+n2);
    }
}
