abstract class ContractEmployee{
   abstract String getDesig();
}
class HourlyEmployee extends ContractEmployee{
   String des;
   void calculateWages(int hours,int wagesper){
       System.out.println(hours*wagesper*30);
    }
    void setDesig(String des){
       this.des=des;
    }
    public String getDesig(){
      return this.des;
    }
    
}
class WeeklyEmployee extends ContractEmployee{
    String des;
    void calculateWages(int weeks,int wagesper){
        System.out.println(weeks*wagesper);
    }
    void setDesig(String des){
       this.des=des;
    }
    public String getDesig(){
       return this.des;
    }
}
public class lab6_4{
   public static void main(String args[]){
       HourlyEmployee he=new HourlyEmployee();
       WeeklyEmployee we=new WeeklyEmployee();
       he.calculateWages(3,1000);
       he.setDesig("emp");
       String s=he.getDesig();
       System.out.println(s);
       we.calculateWages(3,5000);
       we.setDesig("manager");
       String s1=we.getDesig();
       System.out.println(s1);
   }
}
