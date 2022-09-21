import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double t,v,w;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter temperature : ");
        t=sc.nextInt();

        System.out.println("Enter speed : ");
        v=sc.nextInt();

        w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);

        System.out.println("Wind chill  = " + w);
    }

}
