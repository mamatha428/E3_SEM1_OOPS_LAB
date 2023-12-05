import java.util.*;
public class Lab1_2{
static void root(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a,b,c values of quadratic equation:");
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double det=(b*b)-(4*a*c);
double root1,root2;
if(det>0){//real roots as b*b-4*a*c>0
   root1=(-b)/(2*a)+(Math.sqrt(det))/2*a;
   root2=(-b)/(2*a)-(Math.sqrt(det))/(2*a);
   System.out.println("root1:"+root1);
   System.out.println("root2:"+root2);
   return;
   }
if(det==0){//roots are equal as b*b-4*a*c=0
  root1=root2=(-b)/(2*a);
  System.out.println("root1:"+root1);
  System.out.println("root2:"+root2);
  }
else{//roots are imaginary as b*b-4*a*c<0
  root1=(-b)/(2*a);
  root2=Math.sqrt(-det)/(2*a);
  System.out.println("root1:"+root1+"+i"+root2);
  System.out.println("root2:"+root1+"-i"+root2);
  }
  }
  
public static void main(String args[]){
root();
}
}

