package Graphic;

import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;

public class Animal {

    private String hinhHienTai;
    private int x = 0, y = 0;
    private int tocdo = 0;
    boolean dangTien = true;
    String[] mangHinh;
    Random random = new Random();

//    public Animal(String hinhKhoiTao1, String hinhKhoiTao2, int hoanhDo, int tungDo) {
//        hinh1 = hinhKhoiTao1;
//        hinh2 = hinhKhoiTao2;
//        hinhHienTai = hinh1;
//        x = hoanhDo;
//        y = tungDo;
//    }
    public Animal(String[] mangHinhKhoiTao, int hoanhDo, int tungDo) {
        x = hoanhDo;
        y = tungDo;
        mangHinh = mangHinhKhoiTao;
        hinhHienTai = mangHinh[0];
    }

    void randomTocDo() {
        tocdo = random.nextInt(10) + 10;
    }

    void veHinh(Graphics g2d) throws IOException {
        BufferedImage image = ImageIO.read(new File(hinhHienTai));
        AffineTransform tx = AffineTransform.getScaleInstance(1, 1);
        if (!dangTien) {
            tx = AffineTransform.getScaleInstance(-1, 1);
            tx.translate(-image.getWidth(), 0);
        }

        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        g2d.drawImage(op.filter(image, null), x, y, 170, 170, null);
    }

    void doiHinh() {
        for (int i = 0; i < mangHinh.length; i++) {
            int vitriCuoiCung = mangHinh.length - 1;
            if (mangHinh[vitriCuoiCung].equals(hinhHienTai)) {
                hinhHienTai = mangHinh[0];
                break;
            }
            
            if (mangHinh[i].equals(hinhHienTai)) {
                hinhHienTai = mangHinh[i + 1];
                break;
            }
        }
    }

    void run() {
        randomTocDo();
        if (x >= 1600) {
            dangTien = false;
        } else if (x <= 10) {
            dangTien = true;
        }

        if (dangTien) {
            x += tocdo;
            doiHinh();
        } else {
            x -= tocdo;
            doiHinh();
        }
    }
}
