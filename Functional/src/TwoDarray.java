import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        int[][] array=new int[3][3];
        int[][] sum=new int[3][3];
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values:");
        for (i=0;i<3;i++){
            for (j=i;j<i;j++){
                array[i][j]=sc.nextInt();
            }
        }
        for (i=0;i<3;i++){
            for (j=i;j<i;j++){
                System.out.println("{"+array[i][j]+"}");
            }
        }
    }
}
