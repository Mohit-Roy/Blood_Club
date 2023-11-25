package blood.club.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login,cancel;
    JTextField username;
    JPasswordField password;
    
    
    Login()
    {
        setTitle("Blood Club");
        setLayout(null);
        
        JLabel un = new JLabel("Username :"); 
        un.setFont(new Font("Osward",Font.BOLD,25));
        un.setBounds(170,123,350,40);
        add(un);
        
        username = new JTextField();
        username.setBounds(320, 130, 230,30);
        username.setFont(new Font("Arial",Font.BOLD,14));
        add(username);
        
        JLabel pin = new JLabel("Password :"); 
        pin.setFont(new Font("Osward",Font.BOLD,25));
        pin.setBounds(170,203,350,40);
        add(pin);
        
        password = new JPasswordField();
        password.setBounds(320, 210, 230,30);
        password.setFont(new Font("Arial",Font.BOLD,14));
        add(password);
                
        login = new JButton("Login");
        login.setBounds(320, 260, 100, 25);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
  
        cancel = new JButton("Cancel");
        cancel.setBounds(450, 260, 100, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(800,500);
        setVisible(true);
        setLocation(250,120);
        
    
    }
    public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource() == login){
          
          String user = username.getText();
          String pass = password.getText();
          
          try{
              Conn c = new Conn();
              
              String query = "select * from login where username ='"+ user +"'and password ='" + pass +"'";
         
              ResultSet rs = c.s.executeQuery(query);
              
              if(rs.next()){
                  setVisible(false);
                  new Dashboard();
              }else{
                  JOptionPane.showMessageDialog(null,"username or password");
                  setVisible(false);
              }
              
          }catch(Exception e){
              e.printStackTrace();
          }
          
       }else if(ae.getSource() == cancel){
           setVisible(false);
       }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
