// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//package Mypackage;
import java.lang.Math;
import java.util.*;
class First{
    static void Roots(){
        Scanner sc=new Scanner(System.in);
        double a,b,c;
         a=sc.nextDouble();
        b=sc.nextDouble();
         c=sc.nextDouble();
        //double a,b,c;
      //  a=2;
       // b=3;
       // c=4;
        double det;
        double r1,r2;
       // r1=(double)(((-b)+(Math.sqrt(b*b-4*a*c)))/(2*a));
       // r2=(double)(((-b)-(Math.sqrt(b*b-4*a*c)))/(2*a));
       // System.out.println(r1);
       // System.out.println(r2);
       det=(b*b)-(4*a*c);
       if(det>0){
          r1=(-b + Math.sqrt(det))/(2*a);
          r2=(-b - Math.sqrt(det))/(2*a);
          System.out.format("root1:%.2f",r1);//("root1:"+,r1);
          System.out.format("root2:%.2f",r2);//("root2:"+,r2);
       }
       else if(det==0){
           r1=r2=(-b)/(2*a);
           System.out.format("root1:%.2f",r1);
           System.out.format("root2:%.2f",r2);
       }
       else{
           double real,imaginary;
           real=(-b)/(2*a);
           imaginary=Math.sqrt(-det)/(2*a);
           System.out.format("root1:%.2f+%.2f\n",real,imaginary);
           System.out.format("root2:%.2f+i%.2f",real,imaginary);
       }
    }
    public static void main(String args[]){
       // System.out.println("hello world");
       Roots();
    }
}
