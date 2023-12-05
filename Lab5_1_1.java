
abstract class Shape{
  abstract double getArea();
  abstract double getPerimeter();
}
 class Square extends Shape{
    double side;
    Square(double side){
    this.side=side;
    }
    double getArea(){
        return side*side;
        }
   double getPerimeter(){
        return 4*side;
   }
}
 class Rectangle extends Shape{
    double length,breadth;
    Rectangle(double length,double breadth){
    this.length=length;
    this.breadth=breadth;
    }
    double getArea(){
       return length*breadth;
   }
   double getPerimeter(){
       return 2*(length+breadth);
   }
}
 class Circle extends Shape{
    double radius;
    Circle(double radius){
    this.radius=radius;
    }
    double getArea(){
      return 3.14*radius*radius;
      }
   double getPerimeter(){
      return 2*3.14*radius;
      }
}
class Lab5_1_1{
    public static void main(String args[]){
    Square s=new Square(2.2);
    System.out.println(s.getArea());
    System.out.println(s.getPerimeter());
    Rectangle r=new Rectangle(2.2,3.2);
    System.out.println(r.getArea());
    System.out.println(r.getPerimeter());
    Circle c=new Circle(4.4);
    System.out.println(c.getArea());
    System.out.println(c.getPerimeter());
    
    
    }
}
 
  
  
