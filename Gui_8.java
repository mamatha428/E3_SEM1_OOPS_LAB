import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class Gui_8{
    public static void main(String args[]){
       JFrame j=new JFrame();
       j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       j.setLayout(new FlowLayout());
       j.setSize(new Dimension(200,100));
       j.setTitle("Maa Frame");
       
       JLabel label=new JLabel();
       label.setText("Move mouse over me!");
       j.add(label);
       
       MovementListener ml=new MovementListener();
       label.addMouseListener(ml);
       label.addMouseMotionListener(ml);
       
       j.setVisible(true);
    }
 }
       
