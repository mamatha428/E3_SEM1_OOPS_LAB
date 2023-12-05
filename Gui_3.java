import javax.swing.*;
class Gui_3{
    public static void main(String args[]){
    String ageText=JOptionPane.showInputDialog(null,"How old are you ?");
    int age=0;
    try{
       age=Integer.parseInt(ageText);
       }
    catch(NumberFormatException nfe){
       JOptionPane.showMessageDialog(null,"Invalid Integer!");
    }
    String moneyText=JOptionPane.showInputDialog(null,"How much money do you have ?");
    double money=0.0;
    try{
       money=Double.parseDouble(moneyText);
    }
    catch(NumberFormatException nfe){
       JOptionPane.showMessageDialog(null,"Invalid Double!");
    }
    JOptionPane.showMessageDialog(null,"you have "+money+" at the age "+age);
    }
}
