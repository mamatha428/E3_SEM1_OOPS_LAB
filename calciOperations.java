package calculator;
import calculator.Calci;
public class calciOperations implements Calci{
   public void add(int a,int b){
      System.out.println(a+b);
    }
    public void subtract(int a,int b){
      System.out.println(a-b);
    }
    public void multiply(int a,int b){
      System.out.println(a*b);
    }
    public void divide(int a,int b){
      System.out.println(a/b);
    }
    public void modulo(int a,int b){
      System.out.println(a%b);
    }
    public void add(int a,int b,int c){
      System.out.println(a+b+c);
    }
 }
