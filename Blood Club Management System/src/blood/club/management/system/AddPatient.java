package blood.club.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class AddPatient extends JFrame implements ActionListener{
    
    JLabel pform,name,age,gender,weight,bloodgroup,gname,address,phone,top,dname,hname,hphone;
    JTextField pname,page,pweight,pgname,paddress,pphone,pdname,phname,phphone;
    JRadioButton male,female,other;
    JButton submit;
    JComboBox pbloodgroup;
    JCheckBox c1,c2,c3;
    
    AddPatient() {
        setLayout(null);
        
        pform = new JLabel("PATIENT FORM");
        pform.setFont(new Font("Tahoma",Font.BOLD,30));
        pform.setBounds(180,5,300,30);
        pform.setForeground(Color.RED);
        add(pform);
        
        name = new JLabel("Name :");
        name.setFont(new Font("Tahoma",Font.PLAIN,20));
        name.setBounds(50,50,100,30);
        add(name);
        
        pname = new JTextField();
        pname.setFont(new Font("Tahoma",Font.PLAIN,15));
        pname.setBounds(180,50,250,30);
        add(pname); 
        
        age = new JLabel("Age :");
        age.setFont(new Font("Tahoma",Font.PLAIN,20));
        age.setBounds(50,100,100,30);
        add(age);
        
        page = new JTextField();
        page.setFont(new Font("Tahoma",Font.PLAIN,15));
        page.setBounds(180,100,250,30);
        add(page); 
        
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
        
        weight = new JLabel("Weight :");
        weight.setFont(new Font("Tahoma",Font.PLAIN,20));
        weight.setBounds(50,200,100,30);
        add(weight);
        
        pweight = new JTextField();
        pweight.setFont(new Font("Tahoma",Font.PLAIN,15));
        pweight.setBounds(180,200,250,30);
        add(pweight);
        
        gname = new JLabel("Guardian :");
        gname.setFont(new Font("Tahoma",Font.PLAIN,20));
        gname.setBounds(50,250,100,30);
        add(gname);
        
        pgname = new JTextField();
        pgname.setFont(new Font("Tahoma",Font.PLAIN,15));
        pgname.setBounds(180,250,250,30);
        add(pgname);
        
        bloodgroup = new JLabel("Blood Group :");
        bloodgroup.setFont(new Font("Tahoma",Font.PLAIN,20));
        bloodgroup.setBounds(50,300,150,30);
        add(bloodgroup);
        
        String valbloodgroup[] = {"A+","A-","B+","B-","O+","O-","AB+","AB-"};
        pbloodgroup = new JComboBox(valbloodgroup);
        pbloodgroup.setFont(new Font("Tahoma",Font.PLAIN,15));
        pbloodgroup.setBounds(180,300,250,30);
        pbloodgroup.setBackground(Color.WHITE);
        add(pbloodgroup);
        
        phone = new JLabel("Phone :");
        phone.setFont(new Font("Tahoma",Font.PLAIN,20));
        phone.setBounds(50,350,100,30);
        add(phone);
        
        pphone = new JTextField();
        pphone.setFont(new Font("Tahoma",Font.PLAIN,15));
        pphone.setBounds(180,350,250,30);
        add(pphone);
        
        address = new JLabel("Address :");
        address.setFont(new Font("Tahoma",Font.PLAIN,20));
        address.setBounds(50,400,100,30);
        add(address);
        
        paddress = new JTextField();
        paddress.setFont(new Font("Tahoma",Font.PLAIN,15));
        paddress.setBounds(180,400,250,30);
        add(paddress);
        
        top = new JLabel("Type Of Patient :");
        top.setFont(new Font("Tahoma", Font.PLAIN, 20));
        top.setBounds(50,450,170,30);
        add(top);

        c1 = new JCheckBox("Diabetes"); 
        c1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        c1.setBackground(Color.WHITE);
        c1.setBounds(230, 450, 110, 30);
        add(c1);
        
        c2 = new JCheckBox("Pregnant"); 
        c2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        c2.setBackground(Color.WHITE);
        c2.setBounds(350, 450, 110, 30);
        add(c2);
        
        c3 = new JCheckBox("Blood Canser"); 
        c3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        c3.setBackground(Color.WHITE);
        c3.setBounds(470, 450, 150, 30);
        add(c3);
        
        dname = new JLabel("Ref:Doctor :");
        dname.setFont(new Font("Tahoma",Font.PLAIN,20));
        dname.setBounds(50,500,120,30);
        add(dname);
        
        pdname = new JTextField();
        pdname.setFont(new Font("Tahoma",Font.PLAIN,15));
        pdname.setBounds(180,500,250,30);
        add(pdname); 
        
        hname = new JLabel("Hospital :");
        hname.setFont(new Font("Tahoma",Font.PLAIN,20));
        hname.setBounds(50,550,100,30);
        add(hname);
        
        phname = new JTextField();
        phname.setFont(new Font("Tahoma",Font.PLAIN,15));
        phname.setBounds(180,550,250,30);
        add(phname); 
        
        hphone = new JLabel("Hos:Phone:");
        hphone.setFont(new Font("Tahoma",Font.PLAIN,20));
        hphone.setBounds(50,600,120,30);
        add(hphone);
        
        phphone = new JTextField();
        phphone.setFont(new Font("Tahoma",Font.PLAIN,15));
        phphone.setBounds(180,600,250,30);
        add(phphone); 
        
        submit = new JButton("SUBMIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(450, 635, 150, 30);
        submit.addActionListener(this);
        add(submit);
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(250,10,650,720);
        setVisible(true);
  
    }
    public void actionPerformed(ActionEvent ae){
        String name = pname.getText();
        String age = page.getText();
        String weight = pweight.getText();
        String gname = pgname.getText();
        String phone = pphone.getText();
        String address = paddress.getText();
        String dname = pdname.getText();
        String hname = phname.getText();
        String hphone = phphone.getText();
        
        String gender = null;
        
        if(male.isSelected()){ 
            gender = "Male";
        }else if(female.isSelected()){ 
            gender = "Female";
        }else if(other.isSelected()){ 
            gender = "Other";
        }
        
        String bloodgroup = (String)pbloodgroup.getSelectedItem();
        
        String top = "";
        if(c1.isSelected()){
            top = top + "Diabetes";
        }else if(c2.isSelected()){
            top = top + "Pregnant";
        }else if(c3.isSelected()){
            top = top + "Blood Canser";
        }
        
        try{
            Conn c = new Conn();
            String strr = "insert into patient values('"+name+"','"+age+"','"+gender+"','"+weight+"','"+gname+"','"+bloodgroup+"','"+phone+"','"+address+"','"+top+"','"+dname+"','"+hname+"','"+hphone+"')";
         
            c.s.executeUpdate(strr);
          
            JOptionPane.showMessageDialog(null,"Patient Added Successfully");

            setVisible(false);
            
        }catch (Exception e){
          e.printStackTrace();
        }
            
    }
    
    public static void main(String[] args) {
       new AddPatient();
    }
}
