//bubble sort
import java.util.*;
public class Lab2_1{
 //  public static void main(String args[]){
   static void bubbleSort(int[] a){
   int i,j,temp;
   for(i=0;i<a.length;i++){
       for(j=0;j<a.length-i-1;j++){
       if(a[j]>a[j+1]){
       temp=a[j];
       a[j]=a[j+1];
       a[j+1]=temp;
       }
      }
      
     }
   }
   public static void main(String args[]){
      int n,i;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter array size:");
      n=sc.nextInt();
      int[] a=new int[n];
      System.out.println("Enter array elements:");
      for(i=0;i<n;i++){
      a[i]=sc.nextInt();
      }
      bubbleSort(a);
      System.out.println("Sorted array...");
      for(i=0;i<n;i++){
      System.out.print(a[i]+" ");
      }
   }
 }
