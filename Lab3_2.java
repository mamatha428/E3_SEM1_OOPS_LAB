class Lamp{
   boolean isOn;
   String lampType;
  Lamp(boolean isOn,String lampType){
  this.isOn=isOn;
  this.lampType=lampType;
  }
  String turnOn(){
  if(isOn==true)
   return lampType+"is On";
 // System.out.println(lampType+" is On");
  else
    return lampType+"is Off";
 
   
  }
  String turnOff(){
   if(isOn==false)
   return lampType+"is Off";
   //System.out.println(lampType+" is Off");
   else
     return lampType+"is on";
   
  }
 }
 
 class Lab3_2{
   public static void main(String args[]){
   Lamp l1=new Lamp(true,"led");
  // System.out.println(l1.turnOn());
  // String s=l1.turnOn();
   //l1.turnOn();
   Lamp l2=new Lamp(false,"halogen");
   System.out.println(l2.turnOff());
   System.out.println(l1.turnOn());
   }
   }
   
  
