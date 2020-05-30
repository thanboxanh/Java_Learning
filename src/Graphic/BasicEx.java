///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Graphic;
//
//import java.awt.Color;
//import java.awt.EventQueue;
//import java.awt.Graphics;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.geom.AffineTransform;
//import java.awt.image.AffineTransformOp;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.util.Random;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.imageio.ImageIO;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.Timer;
//
///**
// *
// * @author PC
// */
//class Surface extends JPanel {
//
//    int x1 = 10, x2 = 10, yMario = 150, yMeo = 300, yNgaiVat = 150;
//    int tocdo1 = 10, tocdo2 = 10;
//    boolean marioTien, meoTien = true;
//    Random rand = new Random();
//    String hinhMeo1 = "hama1.png", hinhMeo2 = "hama2.png";
//    String hinhHienTaiMeo1 = hinhMeo1;
//
//    String hinh1 = "mario1.png", hinh2 = "mario2.png", hinh3 = "mario3.png";
//    String hinhHienTaiMario = hinh1;
//    int diemMario, diemMeo = 0;
//    int demVeDich = 0;
//    String HinhChuongNgaiVat = "wall.png";
//
//    void doiHinhChoMario() {
//        if(yMario == 60) {
//             hinhHienTaiMario = hinh3;
//             return;
//        }
//        if (hinhHienTaiMario.equals(hinh1)) {
//            hinhHienTaiMario = hinh2;
//        } else if (hinhHienTaiMario.equals(hinh2)) {
//            hinhHienTaiMario = hinh3;
//        } else {
//            hinhHienTaiMario = hinh1;
//        }
//    }
//
//    void doiHinhChoMeo() {
//        if (hinhHienTaiMeo1.equals(hinhMeo1)) {
//            hinhHienTaiMeo1 = hinhMeo2;
//        } else {
//            hinhHienTaiMeo1 = hinhMeo1;
//        }
//    }
//
//    void kiemTraVeDichMario() {
//        switch (demVeDich) {
//            case 0:
//                demVeDich = 1;
//                diemMario++;
//                break;
////            case 1:
////                demVeDich = 0;
////                break;
////            case 2:
////                demVeDich = 0;
////                break;
//        }
//    }
//
//    void kiemTraVeDichMeo() {
//        switch (demVeDich) {
//            case 0:
//                demVeDich = 2;
//                diemMeo++;
//                break;
////            case 1: 
////                demVeDich = 0;
////                break;
////            case 2:
////                demVeDich = 0;
////                break;
//        }
//    }
//
//    public Surface() throws InterruptedException {
//        Thread.sleep(5000);
//        Timer timer = new Timer(50, new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                randomTocDo();
//                if(x1 >= 250 && x1 <= 370) {
//                    yMario = 60;
//                } else {
//                    yMario = 150;
//                }
//                
//                if (marioTien) {
//                    x1 += tocdo1;
//                    doiHinhChoMario();
//                } else {
//                    x1 -= tocdo1;
//                    doiHinhChoMario();
//                }
//                if (meoTien) {
//                    x2 += tocdo2;
//                    doiHinhChoMeo();
//                } else {
//                    x2 -= tocdo2;
//                    doiHinhChoMeo();
//                }
//
//                if (x1 >= 1600) {
//                    marioTien = false;
//                    if(demVeDich != 2) {
//                        kiemTraVeDichMario();
//                    }
//                    
//                } else if (x1 <= 10) {
//                    marioTien = true;
//                }
//                if (x2 >= 1600) {
//                    meoTien = false;
//                    if(demVeDich != 1) {
//                        kiemTraVeDichMeo();
//                    }
//                } else if (x2 <= 10) {
//                    meoTien = true;
//                }
//                
//                
//
//                repaint();
//            }
//        });
//        timer.setInitialDelay(10);
//        timer.start();
//    }
//
//    void randomTocDo() {
//        tocdo1 = rand.nextInt(10) + 10;
//        tocdo2 = rand.nextInt(10) + 10;
//    }
//
//    void run(Graphics g2d) throws IOException {
//        veHinh(g2d, hinhHienTaiMario, x1, yMario);
//        veHinh(g2d, hinhHienTaiMeo1, x2, yMeo + 50);
//        
//        veHinhChuongNgaiVat(g2d, HinhChuongNgaiVat, 300, yNgaiVat);
////        veHinhChuongNgaiVat(g2d, HinhChuongNgaiVat, 600, y + 150);
//        g2d.drawString("Diem cua Mario " + diemMario, 50, 50);
//        g2d.drawString("Diem cua Meo " + diemMeo, 200, 50);
//    }
//
//    private void doDrawing(Graphics g2d) throws InterruptedException {
//        try {
//            run(g2d);
//        } catch (IOException ex) {
//            Logger.getLogger(Surface.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    void ve7SacCauVong(Graphics g2d) {
//        Color[] array = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, new Color(0, 0, 255), new Color(75, 0, 130), new Color(102, 0, 153)};
//        int x = 0;
//        for (int i = 0; i < array.length; i++) {
//            g2d.setColor(array[i]);
//            g2d.fillRect(x, 0, 300, 1200);
//            x = x + 300;
//        }
//    }
//
//    void veHinhTron(Graphics g2d) {
//        g2d.setColor(Color.RED);
//        g2d.drawOval(300, 100, 300, 300);
//        g2d.fillOval(900, 100, 300, 300);
//    }
//
//    void veHinhMario(Graphics g2d, String hinh, int xs, int ys) throws IOException {
//        BufferedImage image = ImageIO.read(new File(hinh));
//        AffineTransform tx = AffineTransform.getScaleInstance(1, 1);
//        if (marioTien) {
//            tx = AffineTransform.getScaleInstance(-1, 1);
//            tx.translate(-image.getWidth(), 0);
//        }
//
//        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
//        g2d.drawImage(op.filter(image, null), xs, ys, 70, 70,null);
//    }
//
//    void veHinh(Graphics g2d) throws IOException {
//        BufferedImage image = ImageIO.read(new File(hinhH));
//        AffineTransform tx = AffineTransform.getScaleInstance(1, 1);
//        if (!meoTien) {
//            tx = AffineTransform.getScaleInstance(-1, 1);
//            tx.translate(-image.getWidth(), 0);
//        }
//
//        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
//        g2d.drawImage(op.filter(image, null), xs, ys, 70, 70, null);
//    }
//    
//    void veHinhChuongNgaiVat(Graphics g2d, String hinh, int xs, int ys) throws IOException {
//        BufferedImage image = ImageIO.read(new File(hinh));
//        g2d.drawImage(image, xs, ys, 70, 70, null);
//    }
//
//    @Override
//    public void paintComponent(Graphics g) {
//
//        super.paintComponent(g);
//        try {
////            ve7SacCauVong(g);
//            doDrawing(g);
//            g.drawLine(1650, yMario, 1650, yMario + 300);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Surface.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//}
//
//public class BasicEx extends JFrame {
//
//    public BasicEx() {
//
//        try {
//            initUI();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(BasicEx.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    private void initUI() throws InterruptedException {
//
//        add(new Surface());
//
//        setTitle("Simple Java 2D example");
//        setSize(2000, 1500);
//        setLocationRelativeTo(null);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//
//    public static void main(String[] args) {
//
//        EventQueue.invokeLater(new Runnable() {
//
//            @Override
//            public void run() {
//                BasicEx ex = new BasicEx();
//                ex.setVisible(true);
//            }
//        });
//    }
//}
