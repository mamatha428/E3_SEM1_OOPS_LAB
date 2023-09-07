
import java.util.*;
public class calci{
    static void calculator(){
        int a,b;
        char ch;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter any operator");
        ch=sc.next().charAt(0);
        switch(ch){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
            case '%':System.out.println(a%b);
            break;
            default:System.out.println("Invalid operator");
        }
        
        }
        public static void main(String args[]){
            calculator();
        }
        }
    
    
