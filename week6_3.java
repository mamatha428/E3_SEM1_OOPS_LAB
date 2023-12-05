import shapes.Square;
import shapes.Triangle;
import shapes.Circle;
public class week6_3{
   public static void main(String args[]){
     Square s=new Square();
     Triangle t=new Triangle();
     Circle c=new Circle();
     s.area(1.2);
     s.perimeter(1.2);
     t.area(2,3);
     t.perimeter(1,2,3);
     c.area(2.2);
     c.perimeter(2.2);
   }
}
