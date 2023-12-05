import java.util.*;
public class Lab1_6{
static void max(int[] a,int n){
int max=-9999,i;
for(i=0;i<n;i++){
if(a[i]>max)
max=a[i];
}
System.out.println("maximum:"+max);
}
static void min(int[] a,int n){
int i,min=9999;
for(i=0;i<n;i++){
if(a[i]<min)
min=a[i];
}
System.out.println("minimum:"+min);
}
public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size:");
n=sc.nextInt();
int[] a=new int[n];
System.out.println("Enter array elements:");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
max(a,n);
min(a,n);
}
}

