package quiz.application.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String name, int score){
        setVisible(true);
        setSize(750, 550);
        setLocation(600, 150);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
  
        JLabel heading = new JLabel("Thankyou " + name + " for playing Simple Minds");
        heading.setBounds(100, 30, 700, 50);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is - " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(lblscore);
        
        JButton b3 = new JButton("Play Again");
        b3.setBounds(380, 270, 120, 30);
        b3.setBackground(Color.PINK);
        b3.setForeground(new Color(82,55,10));
        b3.addActionListener(this);
        add(b3);
    }
    
    public void actionPerformed(ActionEvent e){
        setVisible(false);
        new Login();
    }
    
    public static void main(String ar[]){
        new Score("User", 0);
    }
}
