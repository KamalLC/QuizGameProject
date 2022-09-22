import java.awt.Frame;
import java.awt.*;
import java.awt.event.*;


public class SecondInterface extends Frame implements ActionListener, WindowListener {
    Button b1, b2;
    Panel panel;
    TextField txt1, txt2;
    Label lbl1, lbl2;
    GridLayout gbl;
    // GridBagConstraints gcon;
    
    /**
     * @param FrameTitle
     */
    public SecondInterface(String FrameTitle){
        super(FrameTitle);
        setSize(1000,1000);
        setLocation(10,10);
        setVisible(true);
        setBackground(Color.red);
        setLayout(null);
        
        panel = new Panel();
        panel.setSize(300,100);
        panel.setLocation(200,200);
        gbl = new GridLayout(3,2);
    //    fdfjasj
        
        
        panel.setLayout(gbl);
        
        lbl1 = new Label("Player Name");
        lbl1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lbl1.setBounds(30, 30, 40, 25);
        lbl2 = new Label("Password");
        lbl2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lbl2.setBounds(30, 70, 40, 25);

        txt1 = new TextField(60);
        txt1.setBounds(220, 10, 50, 25);
        txt2 = new TextField(30);
        txt2.setBounds(220, 70, 200, 50);

        b1 = new Button("Save Info");
        b1.setBounds(220, 140, 400, 50);
        b2 = new Button("Back");
        b2.setBounds(20,930, 150, 50);
        

        panel.add(lbl1);
        panel.add(txt1);

        panel.add(lbl2);
        panel.add(txt2);

        
        
        panel.add(b1);
        add(panel);
        add(b2);

        



        addWindowListener(this);
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

    


    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }


    /* (non-Javadoc)
     * @see java.awt.event.WindowListener#windowClosing(java.awt.event.WindowEvent)
     */
    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        this.dispose();
        
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
        new SecondInterface("Register phase");
    }

    
    
}
