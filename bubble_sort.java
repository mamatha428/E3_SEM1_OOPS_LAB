//bubble sort
import java.util.*;
public class Name{
    public static void main(String args[]){
        int n,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j+1]<a[j]){
                  temp=a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array...");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
}
