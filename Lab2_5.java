//Multiplication of two matrices
import java.util.*;
public class Lab2_5{
    static void matMultiplication(int row1,int col1,int row2,int col2){
    int i,j,k;
    Scanner sc=new Scanner(System.in);
    if(col1==row2){
      int[][] a=new int[row1][col1];
      int[][] b=new int[row2][col2];
      int[][] c=new int[row1][col2];//resultant matrix
      //scanning first matrix
      System.out.println("Enter first matrix elements:");
      for(i=0;i<row1;i++){
         for(j=0;j<col1;j++){
             a[i][j]=sc.nextInt();
             }
          }
      //scanning second marix
      System.out.println("Enter second matrix elements:");
      for(i=0;i<row2;i++){
         for(j=0;j<col2;j++){
             b[i][j]=sc.nextInt();
             }
         }
      //finding product of a and b matrices
      for(i=0;i<row1;i++){
          for(j=0;j<col2;j++){
             for(k=0;k<row1;k++){
                c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                }
              }
           }
      //printing resultant matrix c
      for(i=0;i<row1;i++){
         for(j=0;j<col2;j++){
            System.out.print(c[i][j]+"\t");
            }
          System.out.println();
          }
    }
    else{
    System.out.println("Matrix Multiplication is not possible");
    }
   }
    

    public static void main(String args[]){
    int row1,row2,col1,col2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter row and column values of first matrix:");
    row1=sc.nextInt();
    col1=sc.nextInt();
    System.out.println("Enter row and column values of second matrix:");
    row2=sc.nextInt();
    col2=sc.nextInt();
    matMultiplication(row1,col1,row2,col2);
    }
 }
