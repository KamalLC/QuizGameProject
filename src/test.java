// public class test{
// 	public static void main(String[] args){
// 		System.out.println("Testing 3");
// 		String[][] str = {
// 			{"a", "b"},
// 			{"c", "d"}
// 		};

// 		for(int i = 0; i < str.length; i++){
// 			System.out.println(str[i]);
// 		}
// 	}
// }


import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class test {
    public static void main(String[] args) {

        JFrame jframe = new JFrame();
        JLabel jLabel = new JLabel();
        jframe.setLayout(new FlowLayout());
        jframe.setBounds(500, 300, 400, 100);

        jframe.add(jLabel);
        jframe.setVisible(true);

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 20;

            public void run() {

                jLabel.setText("Time left: " + i);
                i--;

                if (i < 0) {
                    timer.cancel();
                    jLabel.setText("Time Over");
                }
            }
        }, 0, 1000);
    }
}

