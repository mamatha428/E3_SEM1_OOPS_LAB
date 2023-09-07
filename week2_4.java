//addition of two matrices
import java.util.*;
public class Name{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r1,c1,r2,c2;
        System.out.println("Enter row and column values of first matrix:");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("Enter row and column values of second matrix:");
        r2=sc.nextInt();
        c2=sc.nextInt();
        int[][] a=new int[r1][c1];
        int[][] b=new int[r2][c2];
        int[][] c=new int[r1][c1];
          //  for(int i=0;i<r1;i++){
          if(r1==r2||c1==c2){
        System.out.println("Enter first matrix elements:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter second matrix elements:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
       // if(r1==r2||c1==c2){
            //int[][] c=new int[r1][c1];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    c[i][j]=a[i][j]+b[i][j];
                }
            }
        }
        else{
        System.out.println("Addition of matrices not possible");
        return;
        }
        System.out.println("resultant matrix...");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
               // System.out.println();
        }
    }
}
