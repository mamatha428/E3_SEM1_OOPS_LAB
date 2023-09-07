
import java.util.*;
public class Num{
 static void Arm(){
    int n;
    System.out.println("Enter a number:");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int temp,res=0,rem,i;
    temp=n;
    while(n!=0){
        rem=n%10;
        res=res+(rem*rem*rem);
        n=n/10;
    }
    if(temp==res)
    System.out.println("Armstrong");
    else
    System.out.println("Not Armstrong");
}
public static void main(String args[])
{
    Arm();
}
}
