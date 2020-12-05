package Graphic;

//<editor-fold defaultstate="collapsed" desc="IMPORT">
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
//</editor-fold>


class Surfaces extends JPanel {

    Animal jguard, dog, chicken, mario;
    Timer timer, timerChuongNgaiVat;
    ChuongNgaiVat ch;
    int[] mangTungDo = {100, 300, 500, 700};
    int dem = 0;

    //<editor-fold defaultstate="collapsed" desc="TAO HINH CON GA">
     void taoHinhGa() {
        String[] hinhGa = new String[7];
        for (int i = 0; i <= hinhGa.length - 1; i++) {
            hinhGa[i] = "chicken-" + (i + 1) + ".jpg";
        }
        chicken = new Animal(hinhGa, 10, 250);
    }
    //</editor-fold>
     
    void taoHinhDog() {
        String[] hinhDog = new String[33];
        for (int i = 0; i <= hinhDog.length - 1; i++) {
            hinhDog[i] = "dog/dog-" + i + ".jpg";
        }
        dog = new Animal(hinhDog, 10, 450);
    }

    void taoHinhGiaBao() {
        String[] hinhBao = new String[24];
        for (int i = 0; i <= hinhBao.length - 1; i++) {
            if(i < 10) {
                hinhBao[i] = "con_bo/frame_0" + i + "_delay-0.02s.gif";
            } else {
                hinhBao[i] = "con_bo/frame_" + i + "_delay-0.02s.gif";
            }

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

    void taoChuongNgaiVat() {
        Random rand = new Random();
        int vitri = rand.nextInt(4);
        int hoanhdo = rand.nextInt(1200) + 200;
        ch = new ChuongNgaiVat("minus.png", hoanhdo, mangTungDo[vitri], 70, 70);
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
        taoHinhGiaBao();
        taoHinhDog();
        taoHinhGa();
        taoHinhMario();
        taoButton();
        taoChuongNgaiVat();

        timer = new Timer(30, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                mario.run(ch);
                jguard.run(ch);
                dog.run(ch);
                chicken.run(ch);
                repaint();
                dem++;
            }
        });
    }

    @Override
    public void paintComponent(Graphics g2d) {
        super.paintComponent(g2d);
        try {
            mario.veHinh(g2d);
            jguard.veHinh(g2d);
            dog.veHinh(g2d);
            chicken.veHinh(g2d);
            ch.veHinh(g2d);
            if(dem == 50) {
                taoChuongNgaiVat();
                dem = 0;
            }

        } catch (Exception ex) {
        }
    }
}

public class RaceGame extends JFrame {

    public RaceGame() {
        try {
            initUI();
        } catch (InterruptedException ex) {
//            Logger.getLogger(BasicEx.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initUI() throws InterruptedException {
        Surfaces s = new Surfaces();
        s.setBackground(Color.WHITE);
        add(s);
        setTitle("Racing game betwwen animals");
        setSize(2000, 1500);
//        setLocationRelativeTo(null);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setBackground(Color.WHITE);
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
