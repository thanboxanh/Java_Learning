/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author PC
 */
public class ChuongNgaiVat {

    String hinh;
    int hoanhdo, tungdo;
    int dai, rong;
    
    public ChuongNgaiVat(String hinhKhoiTao, int hoanhDoKhoiTao, int tungdoKhoiTao, int chieuDai, int chieuRong) {
        hinh = hinhKhoiTao;
        hoanhdo = hoanhDoKhoiTao;
        tungdo = tungdoKhoiTao;
        dai = chieuDai;
        rong = chieuRong;
    }

    public void veHinh(Graphics g2d) {
        BufferedImage image;
        try {
            image = ImageIO.read(new File(hinh));
            g2d.drawImage(image, hoanhdo, tungdo, dai, rong, null);
        } catch (IOException ex) {
            Logger.getLogger(ChuongNgaiVat.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
