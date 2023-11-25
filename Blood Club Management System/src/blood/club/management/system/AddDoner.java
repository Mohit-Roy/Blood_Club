package blood.club.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddDoner extends JFrame implements ActionListener{
    
    JLabel dform,name,age,gender,address,bloodgroup,phone;
    JTextField dname,dage,daddress,dphone;
    JRadioButton male,female,other;
    JButton submit;
    JComboBox dbloodgroup;
    
    AddDoner(){
        setLayout(null);
        
        dform = new JLabel("DONAR FORM");
        dform.setFont(new Font("Tahoma",Font.BOLD,30));
        dform.setBounds(180,5,300,30);
        dform.setForeground(Color.RED);
        add(dform);
        
        name = new JLabel("Name :");
        name.setFont(new Font("Tahoma",Font.PLAIN,20));
        name.setBounds(50,50,100,30);
        add(name);
        
        dname = new JTextField();
        dname.setFont(new Font("Tahoma",Font.PLAIN,15));
        dname.setBounds(180,50,200,30);
        add(dname); 
        
        age = new JLabel("Age :");
        age.setFont(new Font("Tahoma",Font.PLAIN,20));
        age.setBounds(50,100,100,30);
        add(age);
        
        dage = new JTextField();
        dage.setFont(new Font("Tahoma",Font.PLAIN,15));
        dage.setBounds(180,100,200,30);
        add(dage); 
        
        gender = new JLabel("Gender :");
        gender.setFont(new Font("Tahoma",Font.PLAIN,20));
        gender.setBounds(50,150,100,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(180,150,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(260,150,70,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        other = new JRadioButton("Other");
        other.setBounds(350,150,70,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);
        
        address = new JLabel("Address :");
        address.setFont(new Font("Tahoma",Font.PLAIN,20));
        address.setBounds(50,200,100,30);
        add(address);
        
        daddress = new JTextField();
        daddress.setFont(new Font("Tahoma",Font.PLAIN,15));
        daddress.setBounds(180,200,200,30);
        add(daddress);
        
        phone = new JLabel("Phone :");
        phone.setFont(new Font("Tahoma",Font.PLAIN,20));
        phone.setBounds(50,250,100,30);
        add(phone);
        
        dphone = new JTextField();
        dphone.setFont(new Font("Tahoma",Font.PLAIN,15));
        dphone.setBounds(180,250,200,30);
        add(dphone);
        
        bloodgroup = new JLabel("Blood Group :");
        bloodgroup.setFont(new Font("Tahoma",Font.PLAIN,20));
        bloodgroup.setBounds(50,300,150,30);
        add(bloodgroup);
        
        String valbloodgroup[] = {"A+","A-","B+","B-","O+","O-","AB+","AB-"};
        dbloodgroup = new JComboBox(valbloodgroup);
        dbloodgroup.setFont(new Font("Tahoma",Font.PLAIN,15));
        dbloodgroup.setBounds(180,300,200,30);
        dbloodgroup.setBackground(Color.WHITE);
        add(dbloodgroup);
        
        submit = new JButton("SUBMIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(170, 450, 150, 30);
        submit.addActionListener(this);
        add(submit);
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(300,100,600,540);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        String name = dname.getText();
        String age = dage.getText();
        String address = daddress.getText();
        String phone = dphone.getText();
        
        String gender = null;
        
        if(male.isSelected()){ 
            gender = "Male";
        }else if(female.isSelected()){ 
            gender = "Female";
        }else if(other.isSelected()){ 
            gender = "Other";
        }
        
        String bloodgroup = (String)dbloodgroup.getSelectedItem();
       try{
          Conn c = new Conn();
          
          String query = "insert into doner values('"+name+"','"+age+"','"+gender+"','"+address+"','"+phone+"','"+bloodgroup+"')";
         
          c.s.executeUpdate(query);
          
           JOptionPane.showMessageDialog(null,"Doner Added Successfully");

           setVisible(false);
                  
       }catch(Exception e){
           e.printStackTrace();
       }
    }
    
    public static void main(String[] args) {
        new AddDoner();
    }
}
