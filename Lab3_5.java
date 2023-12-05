class Dog{
    String name;
    String breed;
    String color;
    double height;
    String type;
    Dog(String name,String breed,String color,double height,String type){
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.height=height;
        this.type=type;
        }
    String getBreed(){
         return this.breed;
    }
    String getName(){
       return this.name;
       }
    String getColor(){
       return this.color;
       }
    double getHeight(){
       return this.height;
       }
    String getType(){
       return this.type;
       }
  }
  class Lab3_5{
     public static void main(String args[]){
     Dog snoopy=new Dog("snoopy","pomerian","white",1,"guard");
     Dog rocky=new Dog("rocky","lab","brown",3,"snifer");
     Dog snowy=new Dog("snowy","g.sheperd","black",4,"shepherd");
     System.out.println(snoopy.name);
     System.out.println(snoopy.getBreed());
     }
 }
     
     
     
