/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phoneactivity;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ACER PC
 */
public class RandomNum extends JFrame {

    int rndNum, guess;
    JTextField input;
    JButton btn;   
    JLabel output; 
    JLabel correctguess;
    JLabel wronginput;

    public RandomNum() {
        setLayout(new FlowLayout());

        input = new JTextField(5);
        add(input);

        btn = new JButton("Guess");
        add(btn);

        output = new JLabel("Enter your  Guess 1-10");
        add(output);

        correctguess = new JLabel("");
        add(correctguess);

        wronginput = new JLabel("");
        add(wronginput);

        event ef = new event();
        btn.addActionListener(ef);
 
    }

    public class event implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ef) {
            rndNum=(int)(Math.random()* 10  +1);
            
            try{
                guess=(int)(Double.parseDouble(input.getText()));
                
                if(guess==rndNum){
                    output.setText("You won the game !");

                }else if (guess!= rndNum){
                   correctguess.setText("You lost the game");
                  
                    
                }
                wronginput.setText("The random number generated is "+rndNum);
            
            }catch (Exception ex) {
                wronginput.setText("Enter Numbers only!");
            
            }
            

        }

    }
    
    public static void main(String[] args) {
        RandomNum rmd=new RandomNum ();
        rmd.setVisible(true);
        rmd.setSize(300,150);
        rmd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rmd.setTitle("Number Game");
    }

}
