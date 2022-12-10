package mirea.lab.lab6;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

public class Arabia extends JFrame {


    Arabia(){
        super("Saudi Arabia");
        setSize(501, 501);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        JLabel[] labelsSites= new JLabel[5];
        labelsSites[0] = new JLabel("North",SwingConstants.CENTER);
        labelsSites[0].setBorder(BorderFactory.createLineBorder(Color.YELLOW, 5));
        labelsSites[1] = new JLabel("South",SwingConstants.CENTER);
        labelsSites[1].setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
        labelsSites[2] = new JLabel("East",SwingConstants.CENTER);
        labelsSites[2].setBorder(BorderFactory.createLineBorder(Color.RED, 5));
        labelsSites[3] = new JLabel("West",SwingConstants.CENTER);
        labelsSites[3].setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
        labelsSites[4]= new JLabel("Center",SwingConstants.CENTER);
        labelsSites[4].setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        JLabel[] labelsDescription = new JLabel[5];
        labelsDescription[0] = new JLabel("(Добро пожаловать в North Arabia)",SwingConstants.CENTER);
        labelsDescription[1] = new JLabel("(Добро пожаловать Абха)",SwingConstants.CENTER);
        labelsDescription[2] = new JLabel("(Добро пожаловать в Дахране)",SwingConstants.CENTER);
        labelsDescription[3] = new JLabel("(Добро пожаловать в Джидда)",SwingConstants.CENTER);
        labelsDescription[4] = new JLabel("(Добро пожаловать в Center Arabia)",SwingConstants.CENTER);
        add( labelsSites[0], BorderLayout.NORTH);
        add( labelsSites[1], BorderLayout.SOUTH);
        add( labelsSites[2], BorderLayout.EAST);
        add( labelsSites[3], BorderLayout.WEST);
        add( labelsSites[4], BorderLayout.CENTER);
        setSize(500, 500);
        for (int i=0;i<5;i++) {
            int finalI = i;
            labelsSites[i].addMouseListener(
                    new MouseAdapter() {
                        public void mouseEntered(MouseEvent e) {
                            JDialog d = new JDialog(Arabia.this,"Диалоговое окно",true);
                            JButton b = new JButton("OK!");
                            d.setLocationRelativeTo(labelsSites[finalI]);
                            b.addActionListener(
                                    e1 ->{
                                        d.dispose();
                                    }
                            );
                            JPanel p = new JPanel();
                            p.add(labelsDescription[finalI]);
                            p.add(b);
                            d.add(p);
                            d.setSize(250, 100);
                            d.setVisible(true);
                        }
                    }
            );
        }
    }


    public static void main(String[] args) {
        new Arabia();
    }
}
