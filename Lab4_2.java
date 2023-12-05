//equalIgnoreCase usage
import java.util.*;
class Lab4_2{
  static boolean stringCase(String s1,String s2){
  return s1.equalsIgnoreCase(s2);
  } 
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter two strings:");
  String s1=sc.nextLine();
  String s2=sc.nextLine();
  //System.out.println(s2.equalsIgnoreCase(s1));
  System.out.println(stringCase(s1,s2));
  }
 }
  
