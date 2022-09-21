import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {

        int head=0, tail=0,i,n;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter how many times coin flip: ");
        n=sc.nextInt();
        for (i=1; i<=n; i++)
        {
            double rand=Math.random();
            if(rand < 0.5)
                head++;
            else
                tail++;
        }
        System.out.println("Probability of Heads :"+(head)/10.0);
        System.out.println("Probability of Tails :"+(tail)/10.0);
    }
}