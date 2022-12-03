package mirea.lab.lab5;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;


public class Animation extends JFrame {

    JLabel imageLabel;
    private int currImage = 1;
    Animation(){
        super("Easy animation");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        imageLabel = new JLabel("", new ImageIcon(Objects.requireNonNull(getClass().getResource(currImage + ".jpg")).getPath()), SwingConstants.CENTER);
        getContentPane().add(imageLabel);
        Timer timer = new Timer(500, e -> nextFrame());
        timer.start();

        imageLabel.addMouseListener(
                new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        if (timer.isRunning())
                            timer.stop();
                        else
                            timer.start();
                    }
                }
        );
    }
    private void nextFrame(){
        imageLabel.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource((++currImage) + ".jpg")).getPath()));
        if(currImage == 3) currImage = 0;
    }

    public static void main(String[] args) {
        new Animation();
    }
}