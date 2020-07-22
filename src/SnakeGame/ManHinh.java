package SnakeGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Bo Than
 */
public class ManHinh extends JFrame {
    
    static ManHinhGame panel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ManHinh frame = new ManHinh();
                frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
                JLabel jLabel = new JLabel("diem cua ban");
                jLabel.setForeground(Color.red);
                panel = new ManHinhGame(jLabel);
                panel.setMaximumSize(new Dimension(600, 600));
                panel.setBackground(Color.BLACK);
                panel.addKeyListener(panel);
                panel.setFocusable(true);

                frame.taoButton(jLabel);
                frame.add(panel);
                frame.setSize(1500, 700);
                frame.setResizable(false);
                frame.setVisible(true);
            }
        });
    }

    void taoButton(JLabel jLabel) { 
        JPanel panelButton = new JPanel();
        JButton buttonStart = new JButton("Start");
        buttonStart.setSize(300, 300);
        buttonStart.setAlignmentX(LEFT_ALIGNMENT);
        panelButton.add(buttonStart);
        panelButton.setMaximumSize(new Dimension(400, 500));
        
        add(panelButton);
               
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.timer.start();
            }
        });
        JButton buttonStop = new JButton("Stop");
        panelButton.add(buttonStop);
        buttonStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.timer.stop();
            }
        });
        
        panelButton.add(jLabel);
    }
}
