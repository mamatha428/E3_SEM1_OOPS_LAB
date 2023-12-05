import java.util.*;
public class Lab1_3{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
char ch;
System.out.println("Enter any operator:");
 ch=sc.next().charAt(0);
int result;
switch(ch){
case '+':result=a+b;
         System.out.println("sum:"+result);
         break;
case '-':result=a-b;
         System.out.println("differnce:"+result);
         break;   
case '*':result=a*b;
         System.out.println("product:"+result);
         break;
case '/':result=a/b;
         System.out.println("quotient:"+result);
         break;
case '%':result=a%b;
         System.out.println("remainder:"+result);
         break;
default:System.out.println("Invalid operator");
}
}
}
         




