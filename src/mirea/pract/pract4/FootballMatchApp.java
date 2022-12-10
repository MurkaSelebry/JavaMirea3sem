package mirea.pract.pract4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FootballMatchApp extends JFrame {
    JButton buttonMilan = new JButton("AC Milan");
    JButton buttonRM = new JButton("Real Madrid");
    JLabel currentScore = new JLabel("Result: 0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    Label winner = new Label("Winner: DRAW");
    private int ScoreMilan = 0;
    private int ScoreRM = 0;

    FootballMatchApp() {
        super("AC Milan VS Real Madrid");
        setLayout(new FlowLayout());
        setSize(450, 100);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(buttonMilan);
        add(buttonRM);
        add(currentScore);
        add(lastScorer);
        add(winner);
        buttonMilan.addActionListener(
                e -> {
                    currentScore.setText("Result: " + ++ScoreMilan + " X " + ScoreRM);
                    lastScorer.setText("Last Scorer: AC Milan");
                    if (ScoreMilan > ScoreRM)
                        winner.setText("Winner: AC Milan");
                    else if (ScoreMilan == ScoreRM)
                        winner.setText("Winner: DRAW");
                }
        );

        buttonRM.addActionListener(
                e -> {
                        currentScore.setText("Result: " + ScoreMilan + " X " + ++ScoreRM);
                        lastScorer.setText("Last Scorer: Real Madrid");
                        if (ScoreRM > ScoreMilan)
                            winner.setText("Winner: Real Madrid");
                        else if (ScoreMilan == ScoreRM)
                            winner.setText("Winner: DRAW");
                    }
        );



    }
    public static void main(String[] args){
        new FootballMatchApp();
    }
}

