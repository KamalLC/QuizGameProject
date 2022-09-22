import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.Font;


import javax.swing.*;

public class FirstInterface extends JFrame implements WindowListener, ActionListener{
    JButton b0, b1, b2, b3, b4;
    GridLayout gdl;
    static FirstInterface fi;
    JLabel lbl, lbl1;
    JTextField txt;

    public FirstInterface(String FrameTitle){

        super(FrameTitle);
        setSize(1000,1000);
        setLocation(10,10);
        setVisible(true);
        setBackground(Color.RED);

        // gdl = new GridLayout(3, 1);
        setLayout(null);

        
        lbl = new JLabel("!!!Welcome to Who wants to be a Millionare!!!");
        lbl.setBounds(200, 30, 1000, 100);
        lbl.setForeground(Color.BLACK);
        lbl.setFont(new Font("Times New Roman", Font.BOLD, 30));
        add(lbl);

        // txt = new JTextField(40);
        // txt.setBackground(Color.BLACK);
        // txt.setBounds(100, 30, 100, 50);
        // add(txt);

        // lbl1 = new JLabel("Please enter your name:");
        // lbl1.setBounds(300, 50, 1000, 50);
        // add(lbl1);0

        b0 = new JButton("Register Your Name");
        b0.setBounds(400, 180, 200, 50 );
        b0.setBackground(Color.BLACK);
        b0.setForeground(Color.WHITE);
        add(b0);
        

        b1 = new JButton("Rules and Regulation");
        b1.setBounds(400, 280, 200, 50);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        add(b1);

        b2 = new JButton("Play");
        b2.setBounds(400, 380, 200, 50);
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        add(b2);

        b3 = new JButton("Help");
        b3.setBounds(400, 480, 200, 50);
        b3.setForeground(Color.white);
        b3.setBackground(Color.black);
        add(b3);

        b4 = new JButton("Exit");
        b4.setBounds(400, 580, 200, 50);
        b4.setForeground(Color.white);
        b4.setBackground(Color.black);
        add(b4);

        addWindowListener(this);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);




    }
    public void actionPerformed(ActionEvent e){
        JButton eventSource = (JButton)e.getSource();
        if(eventSource == b4){
            this.dispose();
        }
        if(eventSource == b0){

        }
    }
    public void windowClosing(WindowEvent e){
        this.dispose();
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    public static void main(String[] args) {
        new FirstInterface("Quiz Game");
       
    }

    
}
