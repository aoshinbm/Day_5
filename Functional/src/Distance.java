import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        double a=0.0,b=0.0,distance=0.0;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number : ");
        x1=sc.nextInt();

        System.out.println("Enter number : ");
        x2=sc.nextInt();

        System.out.println("Enter number : ");
        y1=sc.nextInt();

        System.out.println("Enter number : ");
        y2=sc.nextInt();

        a=((x2-x1)*(x2-x1));
        b=((y2-y1)*(y2-y1));
        System.out.println("a : "+a+ "b :"+b);

        distance=Math.sqrt(a+b);
        System.out.println("Distance between ("+x1+","+x2+")("+y1+","+y2+") : "+distance);

    }

}
