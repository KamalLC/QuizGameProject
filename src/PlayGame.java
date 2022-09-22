import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.util.Timer;
import java.util.TimerTask;


public class PlayGame extends JFrame implements ActionListener{
    JPanel gameArea, lifeLineArea, winArea;
    JLabel gameOver, nextQuestionLbl;
    JLabel q1k, q2k, q3k, q5k, q10k, q20k, q40k, q80k, q160k, q320k, q640k, q1200k, q2500k, q5000k, q10000k;
    JLabel questionArea, timerLabel, lockLbl, lifeLine, fiftyFifty, swap, doubleGuess, used;
    JButton fifty, swp, dblGuess, playAgain;
    JButton option1, option2, option3, option4, lockBtn, nextQuestionBtn, choosedBtn;
    JButton[] buttonList = new JButton[4];
    Timer timer;
    String[][] questions = {
        {"Where was Gautam Buddha Born?", "China", "Nepal", "India", "Bhutan", "Nepal"},
        {"What is the Capital City of Nepal", "Kathmandu", "Pokhara", "Delhi", "Biratnagar", "Kathmandu"},
        {"Where was Gautam Buddha Born?", "China", "Nepal", "India", "Bhutan", "Nepal"},
        {"What is the Capital City of Nepal", "Kathmandu", "Pokhara", "Delhi", "Biratnagar", "Kathmandu"},
        {"Where was Gautam Buddha Born?", "China", "Nepal", "India", "Bhutan", "Nepal"},
        {"What is the Capital City of Nepal", "Kathmandu", "Pokhara", "Delhi", "Biratnagar", "Kathmandu"},
        {"Where was Gautam Buddha Born?", "China", "Nepal", "India", "Bhutan", "Nepal"},
        {"What is the Capital City of Nepal", "Kathmandu", "Pokhara", "Delhi", "Biratnagar", "Kathmandu"}
    };



    int i, questionCount, winPoint, questionPoint, submitted=0;
    int questionIndex = 0;
    String correctAnswer;
    PlayGame(String FrameTitle){
        super(FrameTitle);
        setBounds(200, 100, 800, 600);
        setLayout(null);
        setVisible(true);
        // setSize(900,900);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // NOTE: correct index is placed at index 5

        gameArea = new JPanel();
        gameArea.setBounds(100, 50, 600, 500);
        gameArea.setOpaque(true);
        gameArea.setBackground(Color.LIGHT_GRAY);
        // add(gameArea);

        timerLabel = new JLabel();
        timerLabel.setBounds(200, 50, 200, 30);

        // Lifeline contents here
        lifeLineArea = new JPanel(new GridLayout(0, 1));
        lifeLineArea.setBounds(600, 150, 100, 300);
        lifeLineArea.setOpaque(true);
        lifeLineArea.setBackground(Color.RED);
        add(lifeLineArea);


        lifeLine = new JLabel("LifeLines");
        fifty = new JButton("50/50");
        swp = new JButton("Swap");
        dblGuess = new JButton("Double Dive");

        used = new JLabel("Used");
        fiftyFifty = new JLabel("50/50");
        swap = new JLabel("Swap");
        doubleGuess = new JLabel("Double Dive");

        lifeLine.setBounds(600, 150, 100, 30);
        fifty.setBounds(600, 180, 100, 30);
        swp.setBounds(600, 210, 100, 30);
        dblGuess.setBounds(600, 240, 100, 30);
        used.setBounds(600, 270, 100, 30);
        fiftyFifty.setBounds(600, 300, 100, 30);
        swap.setBounds(600, 330, 100, 30);
        doubleGuess.setBounds(600, 360, 100, 30);

        lifeLineArea.add(lifeLine);
        lifeLineArea.add(fifty);
        lifeLineArea.add(swp);
        lifeLineArea.add(dblGuess);
        lifeLineArea.add(used);
        lifeLineArea.add(used);
        lifeLineArea.add(fiftyFifty);
        lifeLineArea.add(swap);
        lifeLineArea.add(doubleGuess);


        // win area codes here...

        winArea = new JPanel(new GridLayout(0, 1));
        winArea.setBounds(0, 150, 100, 300);
        winArea.setOpaque(true);
        winArea.setBackground(Color.CYAN);
        // add(winArea);




        questionArea = new JLabel();
        questionArea.setOpaque(true);
        questionArea.setBackground(Color.BLUE);
        questionArea.setBounds(110, 150, 500, 50);
        
        option1 = new JButton();
        option2 = new JButton();
        option3 = new JButton();
        option4 = new JButton();
        lockBtn = new JButton("Lock My Answer");
        lockLbl = new JLabel("Lock My Answer");
        gameOver = new JLabel("Game Over");
        playAgain = new JButton("Play Again");
        nextQuestionBtn = new JButton("Next");
        nextQuestionLbl = new JLabel("Next");
        option1.setBounds(100, 250, 200, 40);
        option2.setBounds(350, 250, 200, 40);
        option3.setBounds(100, 300, 200, 40);
        option4.setBounds(350, 300, 200, 40);

        option1.setBackground(Color.WHITE);
        option2.setBackground(Color.WHITE);
        option3.setBackground(Color.WHITE);
        option4.setBackground(Color.WHITE);

        lockBtn.setBounds(100, 375, 200, 50);
        lockLbl.setBounds(100, 375, 200, 50);
        gameOver.setBounds(100, 375, 450, 50);
        playAgain.setBounds(100, 450, 450, 50);
        nextQuestionBtn.setBounds(350, 375, 200, 50);
        nextQuestionLbl.setBounds(350, 375, 200, 50);

        lockLbl.setHorizontalAlignment(SwingConstants.CENTER);
        lockLbl.setVerticalAlignment(SwingConstants.CENTER);
        gameOver.setHorizontalAlignment(SwingConstants.CENTER);
        gameOver.setVerticalAlignment(SwingConstants.CENTER);
        lockLbl.setOpaque(true);
        lockLbl.setBackground(Color.GRAY);
        gameOver.setOpaque(true);
        gameOver.setBackground(Color.GRAY);

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
        add(lockLbl);
        add(gameOver);
        add(playAgain);
        add(nextQuestionBtn);
        add(nextQuestionLbl);

        // lockLbl.setVisible(false);
        // gameOver.setVisible(false);
        // playAgain.setVisible(false);
        // nextQuestionBtn.setVisible(false);


        option1.addActionListener(this);
        option2.addActionListener(this);
        option3.addActionListener(this);
        option4.addActionListener(this);
        lockBtn.addActionListener(this);
        nextQuestionBtn.addActionListener(this);
        fifty.addActionListener(this);
        dblGuess.addActionListener(this);
        swp.addActionListener(this); 
        playAgain.addActionListener(this); 


        startGame();

    }
    public void startGame(){

        correctAnswer = questions[questionIndex][5];

        lockBtn.setVisible(false);
        lockLbl.setVisible(true);
        gameOver.setVisible(false);
        playAgain.setVisible(false);
        nextQuestionBtn.setVisible(false);
        nextQuestionLbl.setVisible(false);


        // option1.addActionListener(this);
        // option2.addActionListener(this);
        // option3.addActionListener(this);
        // option4.addActionListener(this);
        // lockBtn.addActionListener(this);
        // nextQuestionBtn.addActionListener(this);
        // fifty.addActionListener(this);
        // dblGuess.addActionListener(this);
        // swp.addActionListener(this); 
        // playAgain.addActionListener(this); 



        // Adding timer in the question
        // TODO: limit time acc to question difficulty
        timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask(){
            int i = 30;

            public void run(){
                timerLabel.setText("Time Remaining: " + i);
                i--;

                if(i < 0){
                    timer.cancel();
                    timerLabel.setText("Time Over");
                    lockBtn.setVisible(false);
                    nextQuestionBtn.setVisible(false);
                    gameOver.setVisible(true);
                    playAgain.setVisible(true);
                }
            }
        }, 0, 1000);

        questionArea.setText(questions[questionIndex][0]);
        option1.setText(questions[questionIndex][1]);
        option2.setText(questions[questionIndex][2]);
        option3.setText(questions[questionIndex][3]);
        option4.setText(questions[questionIndex][4]);


        option1.setBackground(Color.WHITE);
        option2.setBackground(Color.WHITE);
        option3.setBackground(Color.WHITE);
        option4.setBackground(Color.WHITE);

    }


    
    public void actionPerformed(ActionEvent e){
        JButton currentBtn = (JButton)e.getSource();
        // System.out.println(currentBtn);

        if(currentBtn.getText() == questions[questionIndex][1] || currentBtn.getText() == questions[questionIndex][2] 
            || currentBtn.getText() == questions[questionIndex][3] || currentBtn.getText() == questions[questionIndex][4]){
            choosedBtn = currentBtn;

            option1.setBackground(Color.WHITE);
            option2.setBackground(Color.WHITE);
            option3.setBackground(Color.WHITE);
            option4.setBackground(Color.WHITE);

            choosedBtn.setBackground(Color.GRAY);

            lockLbl.setVisible(false);
            lockBtn.setVisible(true);
        }
        else if(currentBtn.getText() == "Lock My Answer"){
            submitted = 1;
            currentBtn.setVisible(false);
            lockLbl.setVisible(true);
            timer.cancel();

            nextQuestionLbl.setVisible(false);
            nextQuestionBtn.setVisible(true);

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
        
        }else{
            questionIndex++;
            System.out.println(questionIndex);
            System.out.println(questions[questionIndex][0]);
            startGame();
        }

        }
    
    
    public static void main(String[] args) {
        new PlayGame("Play Game");
    }

}




    
        
     
