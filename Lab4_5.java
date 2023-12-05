import java.io.*;
class Lab4_5{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String s1=sc.nextLine();
    int vcount=0,ccount=0;
    for(int i=0;i<s1.length();i++){
    char ch = s1.charAt(i);
      // if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U'||){
      if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'){
       vcount++;
       }
       else{
       ccount++;
       }
       }
       System.out.println("vowel count:"+vcount);
       System.out.println("cons count:"+ccount);
       }
  }
       
    
    
