/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity104;

/**
 *
 * @author Asus
 */
import javax.swing.*;
public class ElseIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int q1=Integer.parseInt(JOptionPane.showInputDialog("Enter LQ1:"));
        int q2=Integer.parseInt(JOptionPane.showInputDialog("Enter LQ2:"));
        int q3=Integer.parseInt(JOptionPane.showInputDialog("Enter LQ3:"));
        int ave=(q1+q2+q3)/3;
        // TODO code application logic here
        String remarks;
        if ((ave>=80)&& (ave<=100)){
            remarks=("Excellent");
        }
         else if((ave>=60)&& (ave<=79)){
            remarks="Fair";
        }
         else if ((ave>=0)&& (ave<=59))
                  {
            remarks="Fail";
        }
                  else
                  {
          remarks="Illegal grade";
    
                  }
    System.out.println("(" +q1+ "+" +q2+ "+" +q2+ "  )/3="+ ((q1+q2+q3)/3));
    System.out.println(remarks);
    }

}
