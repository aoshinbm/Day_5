import java.util.Scanner;

public class FactorOfNum {
    public static void main(String[] args) {
        int n,i;

        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(i=1;i<=n;i++){
            if(n%i==0)
            {
                System.out.println(" factors are :" +i);
            }
        }
    }
}
