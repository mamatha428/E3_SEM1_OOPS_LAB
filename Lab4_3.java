import java.util.*;
class Lab4_3{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a string:");
  String s1=sc.nextLine();
  System.out.println(s1.length());
  System.out.println(s1.indexOf('c'));
  //System.out.println("Enter any character:");
 // char ch=sc.next().charAt(0);
  /*
  //finding occurences of a character in a given string
  int count=0;
  for(int i=0;i<s1.length();i++){
     if(s1.charAt(i)==ch){
     count++;
     }
     }
    System.out.println("No of occureneces of"+ch+"is:"+count);
    //using indexOf and removeAt finding occurences
    //System.out.println(s1.indexOf(ch));
   // int i=s1.indexOf(ch);
    //System.out.println(s1.deleteCharAt(i)); not worked
    */
    //using indexOf
    //System.out.println("using....");
   // System.out.println();
   
    int i=s1.indexOf('m');
    int count=0;
    while(i!=-1){
       count++;
       i=s1.indexOf('m',i+1);
       }
       System.out.println("count:"+count);
    
  }
}
  
  
