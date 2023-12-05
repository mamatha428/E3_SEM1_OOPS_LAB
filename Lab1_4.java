import java.util.*;
public class Lab1_4{
static void prime(int n){
//Scanner sc=new Scanner(System.in);
//System.out.println("Enter a number:");
//int n=sc.nextInt();
int count=0,i;
for(i=1;i<=n;i++){
if(n%i==0)
count++;
}
if(count==2)
System.out.print("prime");
else
System.out.print("not prime");
}

static void primeFactors(int n){
int count=0,i,j;
for(i=1;i<=n;i++){
if(n%i==0){
count=0;
for(j=1;j<=i;j++){
if(i%j==0)
count++;
}
if(count==2)
System.out.print(i+" ");
}
}
}
public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
//prime(n);
primeFactors(n);
}
}

   

