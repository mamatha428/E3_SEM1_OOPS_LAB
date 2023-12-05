import java.util.*;

public class Lab2_2{
static int linearSearch(int[] a,int val){
int i;
for(i=0;i<a.length;i++){
if(a[i]==val)
return i;
}
return 0;
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size:");
int n,i,val,res;
n=sc.nextInt();
int[] a=new int[n];
System.out.println("Enter array elements:");
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println("Enter searching elements:");
val=sc.nextInt();
res=linearSearch(a,val);
if(res!=0)
System.out.println("value found at index:"+res);
else
System.out.println("value not found");
}
}
