package Graphic;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

class Surfaces extends JPanel {

    Animal mario = new Animal(new String[]{"mario1.png", "mario2.png", "mario3.png"}, 10, 100);
    Animal hippo = new Animal(new String[]{"hama1.png", "hama2.png"}, 10, 300);
//    Animal hourse = new Animal(new String[]{"hourse1.png", "hourse2.png"}, 10, 350);
    Animal jguard, dog;

    void taoHinhBao() {
        String[] hinhBao = new String[7];
        for (int i = 0; i <= hinhBao.length - 1; i++) {
            hinhBao[i] = "chicken-" + (i + 1) + ".jpg";
        }
        jguard = new Animal(hinhBao, 10, 500);
    }
    
    void taoHinhDog() {
        String[] hinhDog = new String[33];
        for (int i = 0; i <= hinhDog.length - 1; i++) {
            hinhDog[i] = "dog/dog-" + i + ".jpg";
        }
        dog = new Animal(hinhDog, 10, 700);
    }

    public Surfaces() throws InterruptedException {
        taoHinhBao();
        taoHinhDog();

        Timer timer = new Timer(50, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                mario.run();
                hippo.run();
                jguard.run();
                dog.run();
                repaint();
            }
        });
        timer.setInitialDelay(10);
        timer.start();

    }

    @Override
    public void paintComponent(Graphics g2d) {
        super.paintComponent(g2d);
        try {
            mario.veHinh(g2d);
            hippo.veHinh(g2d);
            hippo.veHinh(g2d);
            jguard.veHinh(g2d);
            dog.veHinh(g2d);
        } catch (Exception ex) {

        }
    }
}

public class RaceGame extends JFrame {

    public RaceGame() {
        try {
            initUI();
        } catch (InterruptedException ex) {
            Logger.getLogger(BasicEx.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initUI() throws InterruptedException {

        add(new Surfaces());
        setTitle("Racing game betwwen animals");
        setSize(2000, 1500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                RaceGame ex = new RaceGame();
                ex.setVisible(true);
            }
        });
    }
}
