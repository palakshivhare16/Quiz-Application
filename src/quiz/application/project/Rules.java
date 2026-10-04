package quiz.application.project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton b1,b2;
    
    Rules(String name){
        this.name = name;
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name +" to Simple Minds");
        heading.setBounds(160, 50, 700, 45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD, 30));
        heading.setForeground(new Color(31,39,79));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 120, 800, 300);
        rules.setFont(new Font("Tahoma",Font.PLAIN, 15));
        rules.setText(
                "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        b1 = new JButton("BACK");
        b1.setBounds(150, 450, 100, 30);
        b1.setBackground(Color.PINK);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("START");
        b2.setBounds(630, 450, 100, 30);
        b2.setBackground(Color.PINK);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
        setSize(900, 600);
        setLocation(300, 100);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            setVisible(false);
            new Login();
        }
        else if(ae.getSource() == b2){
            setVisible(false);
            new Quiz(name);
        }
    }
    
    public static void main(String ar[]){
        new Rules("USER");
    }
}
