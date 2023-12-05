import java.util.*;
class Lab4_1{
  static int stringCompare(String s1,String s2){
  return s1.compareTo(s2);
  }
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter two strings:");
  String s1=sc.nextLine();
  String s2=sc.nextLine();
  int res=stringCompare(s1,s2);
  if(res==0)
    System.out.println("Strings are equal");
  else if(res>0 || res<0)
  System.out.println("Strings are not equal");
  
  }
 }
  
