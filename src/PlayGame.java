import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.util.Timer;
import java.util.TimerTask;


public class PlayGame extends JFrame implements ActionListener{
   
    JLabel questionArea, timerLabel;
    JButton option1, option2, option3, option4, lockBtn, nextQuestionBtn, choosedBtn;
    JButton[] buttonList = new JButton[4];
    int i;
    String correctAnswer;
    PlayGame(String FrameTitle){
        super(FrameTitle);
        setBounds(200, 100, 800, 600);
        setLayout(null);
        setVisible(true);
        // setSize(900,900);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        String[][] questions = {
            {"Where was Gautam Buddha Born?", "China", "Nepal", "India", "Bhutan", "Nepal"}
        };



        int questionIndex = 0;
        // NOTE: correct index is placed at index 5
        correctAnswer = questions[questionIndex][5];

        timerLabel = new JLabel();
        timerLabel.setBounds(200, 100, 200, 30);

        questionArea = new JLabel(questions[questionIndex][0]);
        questionArea.setBackground(Color.BLUE);
        questionArea.setBounds(100, 150, 500, 50);
        
        option1 = new JButton(questions[questionIndex][1]);
        option2 = new JButton(questions[questionIndex][2]);
        option3 = new JButton(questions[questionIndex][3]);
        option4 = new JButton(questions[questionIndex][4]);
        lockBtn = new JButton("Lock My Answer");
        nextQuestionBtn = new JButton("Next");
        option1.setBounds(100, 250, 200, 40);
        option2.setBounds(350, 250, 200, 40);
        option3.setBounds(100, 300, 200, 40);
        option4.setBounds(350, 300, 200, 40);

        option1.setBackground(Color.WHITE);
        option2.setBackground(Color.WHITE);
        option3.setBackground(Color.WHITE);
        option4.setBackground(Color.WHITE);

        lockBtn.setBounds(100, 375, 200, 50);
        nextQuestionBtn.setBounds(350, 375, 200, 50);

        buttonList[0] = option1;
        buttonList[1] = option2;
        buttonList[2] = option3;
        buttonList[3] = option4;

        add(timerLabel);
        add(questionArea);
        add(option1);
        add(option2);
        add(option3);
        add(option4);
        add(lockBtn);
        add(nextQuestionBtn);

        // Adding timer in the question
        // TODO: limit time acc to question difficulty
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask(){
            int i = 30;

            public void run(){
                timerLabel.setText("Time Remaining: " + i);
                i--;

                if(i < 0){
                    timer.cancel();
                    timerLabel.setText("Time Over");
                }
            }
        }, 0, 1000);


        option1.addActionListener(this);
        option2.addActionListener(this);
        option3.addActionListener(this);
        option4.addActionListener(this);
        lockBtn.addActionListener(this);
        nextQuestionBtn.addActionListener(this);

    }

    
    public void actionPerformed(ActionEvent e){
        JButton currentBtn = (JButton)e.getSource();
        // System.out.println(currentBtn);

        if(currentBtn.getText() != "Lock My Answer" && currentBtn.getText() != "Next"){
            choosedBtn = currentBtn;

            option1.setBackground(Color.WHITE);
            option2.setBackground(Color.WHITE);
            option3.setBackground(Color.WHITE);
            option4.setBackground(Color.WHITE);

            choosedBtn.setBackground(Color.GRAY);
        }
        else if(currentBtn.getText() == "Lock My Answer"){
            if(choosedBtn.getText() == correctAnswer){
                choosedBtn.setBackground(Color.GREEN);
            }else{
                choosedBtn.setBackground(Color.RED);

                for(int i = 0; i < 4; i++){
                    if(buttonList[i].getText() == correctAnswer){
                        buttonList[i].setBackground(Color.GREEN);
                    }
                }
            }
        
        }

        }
    
    
    public static void main(String[] args) {
        new PlayGame("Play Game");
    }

}




    
        
     
