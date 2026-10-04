package quiz.application.project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton b1,b2;
    JTextField tx1;
    
    Login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 500, 400);
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(600, 50, 300, 45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD, 40));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        JLabel heading2 = new JLabel("Enter Your Name");
        heading2.setBounds(650, 100, 300, 45);
        heading2.setFont(new Font("Viner Hand ITC",Font.BOLD, 20));
        heading2.setForeground(Color.PINK);
        add(heading2);
        
        tx1 = new JTextField();
        tx1.setBounds(600, 150, 300, 35);
        tx1.setForeground(new Color(92, 9, 90));
        tx1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        add(tx1);
        
        b1 = new JButton("Rules");
        b1.setBounds(600, 200, 100, 30);
        b1.setBackground(Color.PINK);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("EXIT");
        b2.setBounds(800, 200, 100, 30);
        b2.setBackground(Color.PINK);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
        setSize(1000,400);
        setLocation(250,200);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String name = tx1.getText();
            setVisible(false);
            new Rules(name);
            
        }
        else if(ae.getSource() == b2){
            setVisible(false);
        }
    }   
    
    public static void main(String ar[]){
        new Login();
    }
}
