package Graphic;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

class Surfaces extends JPanel {

//    Animal hippo = new Animal(new String[]{"hama1.png", "hama2.png"}, 10, 250);
//    Animal hourse = new Animal(new String[]{"hourse1.png", "hourse2.png"}, 10, 350);
    Animal jguard, dog, chicken, mario;
    Timer timer;
    
    void taoHinhGa() {
        String[] hinhGa = new String[7];
        for (int i = 0; i <= hinhGa.length - 1; i++) {
            hinhGa[i] = "chicken-" + (i + 1) + ".jpg";
        }
        chicken = new Animal(hinhGa, 10, 250);
    }
    
    void taoHinhDog() {
        String[] hinhDog = new String[33];
        for (int i = 0; i <= hinhDog.length - 1; i++) {
            hinhDog[i] = "dog/dog-" + i + ".jpg";
        }
        dog = new Animal(hinhDog, 10, 450);
    }
    
    void taoHinhBao() {
        String[] hinhBao = new String[24];
        for (int i = 0; i <= hinhBao.length - 1; i++) {
            hinhBao[i] = "bao/bao-" + i + ".jpg";
        }
        jguard = new Animal(hinhBao, 10, 650);
    }
    
    void taoHinhMario() {
        String[] hinhMario = new String[12];
        for (int i = 0; i <= hinhMario.length - 1; i++) {
            hinhMario[i] = "mario/mario-" + i + ".jpg";
        }
        mario = new Animal(hinhMario, 10, 50);
    }
    
    void taoButton() {
        JButton buttonStart = new JButton("Start");
        buttonStart.setLocation(10, 100);
        buttonStart.setSize(300, 300);
        add(buttonStart);
        
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });
        
        JButton buttonStop = new JButton("Stop");
        add(buttonStop);
        buttonStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });
    }
    
    public Surfaces() throws InterruptedException {
        taoHinhBao();
        taoHinhDog();
        taoHinhBao();
        taoHinhGa();
        taoHinhMario();
        taoButton();
        
        timer = new Timer(70, new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                mario.run();
                jguard.run();
                dog.run();
                chicken.run();
                repaint();
            }
        });
//        timer.setInitialDelay(10);
//        timer.start();
        
    }
    
    @Override
    public void paintComponent(Graphics g2d) {
        super.paintComponent(g2d);
        try {
            mario.veHinh(g2d);
            jguard.veHinh(g2d);
            dog.veHinh(g2d);
            chicken.veHinh(g2d);
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
