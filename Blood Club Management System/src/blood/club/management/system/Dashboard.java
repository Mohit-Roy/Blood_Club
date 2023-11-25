package blood.club.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame {
    
    JMenuBar mb;
    JMenu admin,blood;
    
    Dashboard() {
        
        setTitle("Blood Bank Club");
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Blood1.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(800,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 700);
        image.setFont(new Font("System", Font.BOLD, 30));
        add(image);
        
        JLabel text = new JLabel("Welcome to Blood Bank Club Of EUB"); 
        text.setFont(new Font("Tahoma",Font.BOLD,30));
        text.setBounds(100,40,550,30);
        text.setForeground(Color.WHITE);
        image.add(text);
        
        
        mb = new JMenuBar();
        mb.setBounds(0,0,800,30);
        image.add(mb);

        blood = new JMenu("BLOOD MANAGEMENT");
        blood.setForeground(Color.RED);
        mb.add(blood);
        
        JMenuItem hospital = new JMenuItem("HOSPITAL");
        blood.add(hospital);
        
        admin = new JMenu("ADMIN");
        admin.setForeground(Color.BLUE);
        mb.add(admin);

        JMenuItem doner = new JMenuItem("ADD DONER");
        admin.add(doner);
        
        JMenuItem patient = new JMenuItem("ADD PATIENT");
        admin.add(patient);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        //setSize(824,720);
        setVisible(true);
        //setLocation(150,10);
        setBounds(100,25,800,700);
        
        
    }
public static void main(String[] args) {
        new Dashboard();
    }
}
