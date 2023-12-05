//Addition of two matrices
import java.util.*;
public class Lab2_4{

   static void matrixAddition(int row1,int row2,int col1,int col2){
     int i,j;
     Scanner sc=new Scanner(System.in);
     if(row1==row2 && col1==col2){
     int[][] a=new int[row1][col1];
     int[][] b=new int[row2][col2];
    // int[][] c=new int[row1][col2];//for the resultant matrix
     //scanning first matrix
     System.out.println("Enter first matrix elements:");
     for(i=0;i<row1;i++){
        for(j=0;j<col1;j++){
           a[i][j]=sc.nextInt();
           }
      }
      //scanning second matrix
     System.out.println("Enter second matrix elements:");
     for(i=0;i<row2;i++){
        for(j=0;j<col2;j++){
           b[i][j]=sc.nextInt();
           }
     }
     //matrices addition
     for(i=0;i<row1;i++){
        for(j=0;j<col2;j++){
           a[i][j]=a[i][j]+b[i][j];
           }
        }
     //printing resultant array
     for(i=0;i<row1;i++){
        for(j=0;j<col2;j++){
           System.out.print(a[i][j]+"\t");
           }
         System.out.println();
     }
   }
   else{
   System.out.println("Addition is not possible");
 }
}
  public static void main(String args[]){
  
  int row1,col1,row2,col2,i,j;
  Scanner sc=new Scanner(System.in);
     System.out.println("Enter row and column values of first matrix:");
     row1=sc.nextInt();
     col1=sc.nextInt();
     System.out.println("Enter row and column values of second matrix:");
     row2=sc.nextInt();
     col2=sc.nextInt();
     matrixAddition(row1,row2,col1,col2);
    /* if(row1==row2 && col1==col2){
     int[][] a=new int[row1][col1];
     int[][] b=new int[row2][col2];
     int[][] c=new int[row1][col2];//for the resultant matrix
     //scanning first matrix
     System.out.println("Enter first matrix elements:");
     for(i=0;i<row1;i++){
        for(j=0;j<col1;j++){
           a[i][j]=sc.nextInt();
           }
      }
      //scanning second matrix
     System.out.println("Enter second matrix elements:");
     for(i=0;i<row2;i++){
        for(j=0;j<col2;j++){
           b[i][j]=sc.nextInt();
           }
     }
     //matrices addition
     for(i=0;i<row1;i++){
        for(j=0;j<col2;j++){
           c[i][j]=a[i][j]+b[i][j];
           }
        }
     //printing resultant array
     for(i=0;i<row1;i++){
        for(j=0;j<col2;j++){
           System.out.print(c[i][j]+"\t");
           }
         System.out.println();
     }
   }
   else{
   System.out.println("Addition is not possible");
 }*/
 }
 }
          
        
    
