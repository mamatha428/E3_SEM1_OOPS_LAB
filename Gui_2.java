import javax.swing.*;
class Gui_2{
    public static void main(String args[]){
    //reading input from the user
    String name=JOptionPane.showInputDialog(null,"What is your name?");
    //asking user
    int choice=JOptionPane.showConfirmDialog(null,"Do you like chocolates "+name+"?");
    if(choice==JOptionPane.NO_OPTION){
       JOptionPane.showMessageDialog(null,"we have to agree to disagree");
    }
    else{
       JOptionPane.showMessageDialog(null,"Of course we like it!");
    }
    }
}
    
    
    
