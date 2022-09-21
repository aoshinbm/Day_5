import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number1 : ");
        n1=sc.nextInt();

        System.out.println("Enter number2 : ");
        n2=sc.nextInt();

        System.out.println("Enter number3 : ");
        n3=sc.nextInt();

        if(n1>n2 && n1>n3)
        {
            System.out.println(n1+" is the largest number.");
        }
        else if(n2>n1 && n2>n3)
        {
            System.out.println(n2+" is the largest number.");
        }
        else if(n3>n1 && n3>n2)
        {
            System.out.println(n3+" is the largest number.");
        }
    }
}
