class Lamp{
  static boolean isOn;
  static String lampType;
  Lamp(boolean isOn,String lampType){
  this.isOn=isOn;
  this.lampType=lampType;
  }
  void turnOn(){
  if(isOn==true)
     System.out.println(lampType+" Already On");
  else
     isOn=true;
  }
  void turnOff(){
   if(isOn==false)
     System.out.println(lampType+" Already Off");
   else
      this.isOn=false;
  }
  String getStatus(){
      if(isOn==true)
        return lampType+" is turned on";
      else
        return lampType+" is turned off";
 }
 }
 
 class Lab3_2_1{
   public static void main(String args[]){
   Lamp l1=new Lamp(true,"led");
  // String s=l1.turnOn();
   String s1=l1.getStatus();
   System.out.println(s1);
   Lamp l2=new Lamp(false,"halogen");
   String s2=l2.getStatus();
   System.out.println(s2);
   }
   }
   
