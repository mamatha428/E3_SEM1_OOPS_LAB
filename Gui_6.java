import java.awt.*;
import javax.swing.*;
class Gui_6{
    public static void main(String args[]){
        JFrame j=new JFrame();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(new Dimension(300,100));
        j.setTitle("Maa Frame");
        //here first button is not visible because
        //it is hidden behind the second button to solve this problem see Gui_7.java
        JButton b1=new JButton();
        b1.setText("First Button");
        b1.setBackground(Color.BLUE);
        j.add(b1);
        
        JButton b2=new JButton();
        b2.setText("Second Button");
        b2.setBackground(Color.RED);
        j.add(b2);
        
        j.setVisible(true);
    }
}
        
