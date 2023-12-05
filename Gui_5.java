import java.awt.*;
import javax.swing.*;
class Gui_5{
    public static void main(String args[]){
        JFrame j=new JFrame();
        j.setForeground(Color.WHITE);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLocation(new Point(10,500));//for moving right change first value x-co-ordinate
        //for moving down chang second value i.e y co-ordinate
        j.setSize(new Dimension(500,120));//here 500=width,120=height
        j.setTitle("Maa Frame");
        j.setVisible(true);
        //JButton b1=new JButton();
        //b1.setText("First Button");
        
     }
}
