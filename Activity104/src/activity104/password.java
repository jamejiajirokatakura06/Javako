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

/**
 *
 * @author Asus
 */
public class password {
    public static void main(String Args[]){
        String pword,pword2;
        
        pword = JOptionPane.showInputDialog("Register your password : ");
        
        JPasswordField varA = new JPasswordField();
        JOptionPane.showConfirmDialog(null,varA,"Enter your password: ",JOptionPane.OK_CANCEL_OPTION);
        
        String input;
        pword2 = new String(varA.getPassword());
        
        if(pword2.equalsIgnoreCase(pword)){
            System.out.println("Congratualations, access granted!");
        }
        else{
            System.out.println("ACCESS DENIED!!!");
        }
    }
}
