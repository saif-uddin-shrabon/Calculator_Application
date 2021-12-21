
package calculator;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Calculator implements ActionListener{
     JTextField textfield;
     JButton[] numberButton = new JButton[10];
     JButton[] functionButton = new JButton[8];
     JButton addButton, subButton, mulButton,divButton;
     JButton decButton, equButtion, delButton, clrButton,equButton;
     JPanel panel;
     
     double num1 =0, num2 = 0, result = 0;
     char operator;
     
     Calculator(){
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(520, 650);
        frame.setLayout(null);
        
        JPanel panel1 = new JPanel(new FlowLayout(SwingConstants.LEADING, 10, 10));
        panel1.setBounds(25,15,350,70);
        panel1.setBackground(Color.gray);
        JTextField textfield = new JTextField(11);
        textfield.setFont(textfield.getFont().deriveFont(35f));
//        textfield.setBounds(10,5,280,60);
        textfield.setEditable(false);
        
        //functional button
        JPanel panel2 = new JPanel();
        panel2.setBounds(25,100,350,400);
        panel2.setBackground(Color.yellow);
        
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("D");
        clrButton = new JButton("C");
        
        functionButton[0] = addButton;
        functionButton[1] = subButton;
        functionButton[2] = mulButton;
        functionButton[3] = divButton;
        functionButton[4] = decButton;
        functionButton[5] = equButton;
        functionButton[6] = delButton;
        functionButton[7] = clrButton;
                
                
       for(int i=0; i<8;i++){
           functionButton[i].addActionListener(this);
           functionButton[i].setFocusable(false);
       }
       
       for(int i =0; i<10; i++){
           numberButton[i] = new JButton(String.valueOf(i));
           numberButton[i].addActionListener(this);
           numberButton[i].setFocusable(false);
       }
       
       delButton.setBounds(50,515,145,50);
       clrButton.setBounds(250,515,145,50);
        
        
        panel1.add(textfield);
         frame.add(panel1);
        frame.add(panel2, BorderLayout.WEST);
          frame.add(delButton);
        frame.add(clrButton);
        
      
       
        frame.setVisible(true);
     }
   
   
    public static void main(String[] args) {
      
       Calculator calc = new  Calculator();
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
