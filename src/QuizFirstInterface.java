import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class QuizFirstInterface extends JFrame implements ActionListener{
    private static final Color Color = null;
    JButton b1, b2, b3, b4, b5, b6;
    JTextField t1, t2, t3, t4, t5;
   
    JLabel lbl1;
    private static QuizFirstInterface quizFirstInterface;

    /**
     * @param FrameTitle
     */
    QuizFirstInterface(String FrameTitle){
        super(FrameTitle);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);

        // b1 = new JButton("next");
        t1 = new JTextField("Who belongs to hindiusim");
        t1.setBounds(50, 30, 200, 100);
        add(t1);

        t2 = new JTextField("Ram");
        t2.setBounds(50, 150, 100, 100);
        add(t2);

        t3 = new JTextField("Mohammad");
        t3.setBounds(150, 150, 100, 100);
        add(t3);
        
        t4 = new JTextField("Jesus");
        t4.setBounds(50, 250, 100, 100);
        add(t4);
        t4.setForeground(Color.GREEN);
        t4.setBackground(Color.blue);
        t5 = new JTextField("Catholic");
        

        // t1.setBorder(5);
        t5.setBounds(100, 50, 100,100);
        add(t5);







        

        

    }
    public static void main(String[] args) {
        quizFirstInterface = new QuizFirstInterface("This is title");
        quizFirstInterface.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

    
}
