package blood.club.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage extends JFrame implements ActionListener{

    JButton next;
    
    HomePage()
    {
        setTitle("Blood Bank Club");
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Blood.jpg"));
        Image i2 = i1.getImage().getScaledInstance(6000,4000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 6000, 4000);
        image.setFont(new Font("System", Font.BOLD, 30));
        add(image);
        
        JLabel text = new JLabel("Welcome to Blood Bank Club Of EUB"); 
        text.setFont(new Font("Osward",Font.BOLD,30));
        text.setBounds(200,30,600,40);
        text.setForeground(Color.WHITE);
        image.add(text);
        
        JLabel text1 = new JLabel("Blood Bank Club"); 
        text1.setFont(new Font("Osward",Font.BOLD,30));
        text1.setBounds(300,500,250,40);
        text1.setForeground(Color.WHITE);
        image.add(text1);
        
        next = new JButton("NEXT");
        next.setBounds(650, 500, 150, 40);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("Arial",Font.BOLD,20));
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        //setSize(824,720);
        setVisible(true);
        //setLocation(150,10);
        setBounds(100,25,1000,600);
        
        while(true){
            text1.setVisible(false);
            try{
                Thread.sleep(700);
            }catch(Exception e){
                e.printStackTrace();
            }
            text1.setVisible(true);
            try{
                Thread.sleep(700);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();
    }
        
    
    public static void main(String[] args) {
        new HomePage();
    }
    
}
