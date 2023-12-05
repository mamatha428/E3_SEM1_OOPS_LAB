class TV{
  int channel;
  int volumeLevel;
  boolean on;
  TV(){
    channel=1;
    volumeLevel=2;
    on=false;
  }
  void turnOn(){
   on=true;
  }
  void turnOff(){
   on=false;
  }
  void setChannel(int newChannel){
    channel=newChannel;
  }
  void setVolume(int newVolumeLevel){
    volumeLevel=newVolumeLevel;
  }
  void channelUp(){
    channel++;
  }
  void channelDown(){
    channel--;
  }
  void volumeUp(){
    volumeLevel++;
  }
  void volumeDown(){
    volumeLevel--;
  }
   int getChannel(){
     return channel;
  }
  int getVolume(){
     return volumeLevel;
 }
 }
 class Lab3_3{
   public static void main(String args[]){
   TV t=new TV();
   t.turnOn();
   //t.setChannel(32);
  // t.setVolume(2);
   t.channelUp();
   t.volumeUp();
   System.out.println(t.getChannel());
   System.out.println(t.getVolume());
   }
  }
  
  
