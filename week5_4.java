//week 5-4  problem
//in lab manual
class Account{
   double balance;
   String aName;
   String aNo;
   String address;
   double aBalance;
   Account(double balance,String aName,String aNo,String address,double aBalance){
      this.balance=balance;
      this.aName=aName;
      this.aNo=aNo;
      this.address=address;
      this.aBalance=aBalance;
   }
   void credit(double b){
     balance=balance+b;
   }
   void debit(double b){
     if(b>aBalance){
       System.out.println("Debit amount exceeded account balance");
     }
     else{
        balance=balance-b;
     }
    }
   double getBalance(){
      return this.balance;
   }
}
class week5_4{
    public static void main(String args[]){
        Account a=new Account(100,"mamatha","sbi31428","pvr",2000);
        Account a2=new Account(10,"kumar","sbi90148","wrngl",5000);
        a.credit(150);
        a.debit(50);
        System.out.println(a.balance);
        a2.credit(200);
        a2.debit(7000);
        System.out.println(a2.balance);
        
     }
}
   
   
   
