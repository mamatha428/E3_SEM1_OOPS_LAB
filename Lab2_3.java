//binary search
import java.util.*;
public class Lab2_3{
static int binarySearch(int[] a,int val){
int mid,low,high;
low=0;
high=a.length-1;
//System.out.println("h:"+high);
while(low<=high){
  mid=low+(high-low)/2;//try once 
  if(a[mid]==val)
     return mid;
  if(val<a[mid])
     high=mid-1;
  else
     low=mid+1;
     }
   return 0;
 }
     
public static void main(String args[]){
int n,res,val;
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size:");
   n=sc.nextInt();
int[] a=new int[n];
System.out.println("Enter array elements:");
   for(int i=0;i<n;i++){
   a[i]=sc.nextInt();
   }
System.out.println("Enter searching element value:");
   val=sc.nextInt();
   res=binarySearch(a,val);
   if(res!=0)
     System.out.println("value found at index:"+res);
   else
     System.out.println("value not found");
  }
}
   
