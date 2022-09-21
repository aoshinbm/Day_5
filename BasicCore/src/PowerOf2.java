import java.util.Scanner;

class Powerof2 {
    public static void main(String[] args) {
        int expo,power,i,ans=0;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter exponential : ");
        expo=sc.nextInt();

        System.out.println("Enter power : ");
        power=sc.nextInt();

/*        for(i=0;i<=expo;i++)
        {
            power=power*2;
        }
 */
        ans= (int) Math.pow(expo,power);
        System.out.println("Result of "+expo+" power of " +power+" and result is = "+ans);
    }
}
