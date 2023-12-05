
abstract class Shape{
  abstract double getArea();
  abstract double getPerimeter();
}
abstract class Square extends Shape{
   static double getArea(double side){
        return side*side;
        }
   double getPerimeter(double side){
        return 4*side;
   }
}
abstract class Rectangle extends Shape{
   static double getArea(double length,double breadth){
       return length*breadth;
   }
   double getPerimeter(double length,double breadth){
       return 2*(length+breadth);
   }
}
abstract class Circle extends Shape{
   static double getArea(double radius){
      return 3.14*radius*radius;
      }
   double getPerimeter(double radius){
      return 2*3.14*radius;
      }
}
class Lab5_1{
    public static void main(String args[]){
    double res1=Square.getArea(2.2);
    System.out.println(res1);
    }
}
 
  
