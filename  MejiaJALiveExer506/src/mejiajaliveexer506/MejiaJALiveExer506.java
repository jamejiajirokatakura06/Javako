/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mejiajaliveexer506;
import java.awt.*;

public class MejiaJALiveExer506 extends Frame {
    Button Home,AboutUs,MVC,ContactUs;
    Button BUTTON1,BUTTON2,BUTTON3,BUTTON4;
     
    public MejiaJALiveExer506 (){
        Home=new Button ("Home");
            Home.setBackground(Color.pink);
        AboutUs=new Button ("About Us");
            AboutUs.setBackground(Color.red);
        MVC=new Button ("MVC");
            MVC.setBackground(Color.orange);
        ContactUs=new Button ("Contact Us");
            ContactUs.setBackground(Color.yellow);
        Panel b= new Panel();
        b.setLayout(new GridLayout(0,4));
           setResizable(true);
           setSize(750,750);
           
           
        BUTTON1=new Button ("BUTTON 1");
         BUTTON1.setBackground(Color.green);
        BUTTON2=new Button ("BUTTON 2");
         BUTTON2.setBackground(Color.blue);
        BUTTON3=new Button ("BUTTON 3");
         BUTTON3.setBackground(Color.white);
        BUTTON4=new Button("BUTTON 4");
         BUTTON4.setBackground(Color.gray);
        Panel a= new Panel();
        a.setLayout(new GridLayout(0,1));
           setResizable(true);
           setSize(500,500);
           
           
        b.add(Home); 
        b.add(AboutUs);
        b.add(MVC);
        b.add(ContactUs);
        
        a.add(BUTTON1);
        a.add(BUTTON2);
        a.add(BUTTON3);
        a.add(BUTTON4);
        
        add(b,BorderLayout.NORTH);
        add(a,BorderLayout.WEST);
    }
    public static void main (String args[]){
        MejiaJALiveExer506 b= new MejiaJALiveExer506();
        b.setBackground(Color.black);
        b.setSize(400,400);
        b.setVisible(true);
        
           
    }
}
