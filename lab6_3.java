class Employee{
    String fname;
    String lname;
    void setFirstName(String name){
        fname=name;
    }
    String getFirstName(){
        return fname;
    }
    void setLastName(String name){
        lname=name;
    }
    String getLastName(){
        return lname;
    }
}
class ContractEmployee extends Employee{
    String des;
    String dept;
    void displayFullName(){
        System.out.println(getFirstName()+" "+getLastname());
    }
    void setDept(String dept){
        this.dept=dept;
    }
    String getDept(){
        return dept;
    }
    void setDesig(String des){
       this.des=des;
    }
    String getDesig(){
       return des;
    }
}
class RegularEmployee extends Employee{
    String des;
    String dept;
    void setDept(String dept){
       this.dept=dept;
    }
    String getDept(){
       return dept;
    }
    void setDes(String des){
        this.des=des;
    }
    String getDesig(){
       return des;
    }
}
public class lab6_3{
    public static void main(String args[]){
       Employee e=new Employee();
       ContractEmployee ce=new ContractEmployee();
       ce.setFirstName("abhiman");
       ce.setLastName("arjun");
       ce.getFirstName();
       ce.getLastName();
     //  ce.displayFullName();
    }
}
       

    
      
    
