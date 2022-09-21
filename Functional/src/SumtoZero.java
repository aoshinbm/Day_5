import java.util.Scanner;

public class SumtoZero {
    public static void main(String[] args) {
        int i,j,k,n=3;
        int[] array=new int[3];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        for (i=0;i<3;i++){
            array[i]=sc.nextInt();
        }
        for (i=0;i<n-2;i++){
            for (j=i+1;j<n-1;j++){
                for (k=j+1;k<n;k++){
                    System.out.println(array[i]+" "+array[j]+" "+array[k]);
                    if((array[i]+array[j]+array[k])==0){
                        System.out.println("Sum adds to zero");
                    }
                    else {
                        System.out.println("Not equal to zero");
                    }
                }
            }
        }
    }
}
