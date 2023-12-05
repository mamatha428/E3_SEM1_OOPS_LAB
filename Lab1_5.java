import java.util.*;
public class Lab1_5{
static void palindrome(int n){
int temp,rem,result=0;
temp=n;
while(n!=0){
  rem=n%10;
  result=result*10+rem;
  n=n/10;
}
if(temp==result)
   System.out.println(temp+" is Palindrome");
else
   System.out.println(temp+" is not Palindrome");
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
palindrome(n);
}
}
  
