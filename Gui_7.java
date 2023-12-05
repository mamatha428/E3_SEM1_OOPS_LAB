import java.awt.*;
import javax.swing.*;
class Gui_7{
    public static void main(String args[]){
        JFrame j=new JFrame();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(new Dimension(300,100));
        j.setTitle("Maa Frame");
       //to avoid the problem in Gui_6.java
       //add layout
        j.setLayout(new FlowLayout());
        
        JButton b1=new JButton();
        b1.setText("First Button");
        b1.setBackground(Color.BLUE);
        j.add(b1);
        
        JButton b2=new JButton();
        b2.setText("Second Button");
        b2.setBackground(Color.RED);
        j.add(b2);
        
        //adding text field in the frame
        JTextField field=new JTextField(8);
        j.add(field);
        
        //adding label
        JLabel label=new JLabel("This is a label");
        j.add(label);
        
        j.setVisible(true);
    }
}
        
