//sort given list of names
import java.util.*;
public class Lab2_6{

   static void sortString(String[] s){
   int i;
   Arrays.sort(s);
   System.out.println("Sorted names...");
   for(i=0;i<s.length;i++){
   System.out.print(s[i]+" ");
   }
  }
   
   public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int n,i;
   System.out.println("Enter number of names:");
   n=sc.nextInt();
   String[] s=new String[n];
   System.out.println("Enter names:");
   for(i=0;i<n;i++){
   s[i]=sc.next();//if we keep nextLine only taking 3 names if we give n=4 ,not taking 4 names so  next() i used
   }
   sortString(s);
   }
 }
   
