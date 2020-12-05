package SnakeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ThanBoXanh
 */
public class ManHinh extends JFrame {

    static ManHinhGame panel;
//    static Player player;

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
//        buttonStart.setAlignmentX(LEFT_ALIGNMENT);
        panelButton.add(buttonStart);
        panelButton.setMaximumSize(new Dimension(300, 500));

        add(panelButton);

        Runnable runnablePlay = new Runnable() {
            @Override
            public void run() {
//                FileInputStream fileInputStream;
//                try {
//                    fileInputStream = new FileInputStream(new File("music.mp3"));
//                    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
//                    player = new Player(bufferedInputStream);
//                    player.play();
//                } catch (FileNotFoundException ex) {
//                    Logger.getLogger(ManHinh.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (JavaLayerException ex) {
//                    Logger.getLogger(ManHinh.class.getName()).log(Level.SEVERE, null, ex);
//                }
            }
        };

        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!panel.losed) {
                    panel.requestFocus();
                    panel.timer.start();
                }
                Thread playThread = new Thread(runnablePlay);
                playThread.start();
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

        JTextField jTextField = new JTextField();
        jTextField.setText("player 1");
        jTextField.setPreferredSize(new Dimension(100, 30));
        buttonStart.setAlignmentX(LEFT_ALIGNMENT);
        panelButton.add(jLabel);

        JButton buttonReset = new JButton("lam lai cuoc doi");
        buttonReset.setBackground(Color.red);
        panelButton.add(buttonReset);
        panelButton.add(jTextField);
        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.reset();
                panel.losed = false;
            }
        });
    }
}
