/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HuongDoiTuong;

/**
 *
 * @author PC
 */
public class conbo {

    String ten;
    int cannang;
    String chatluongthit;
    String donVi;

    public conbo(String a, int b, String c, String d) {
        ten = a;
        cannang = b;
        chatluongthit = c;
        donVi = d;
        System.out.println("Tên là " + ten);
        System.out.println("Cân nặng " + cannang + " " + donVi);
        System.out.println("Chất lượng thịt là " + chatluongthit);
    }
    
    private void doiDonVi() {
        if (donVi.equals("g")) {
            cannang = cannang / 1000;
        } else if (donVi.equals("ta")) {
            cannang = cannang * 100;
        } else if(donVi.equals("tan")) {
            cannang = cannang * 1000;
        }
        System.out.println("Can nang sau khi chuyen doi la: " + cannang);
    }

    public void KiemTraTheTrang() {
        doiDonVi();
        
        if (cannang < 50) {
            System.out.println("Loại cân nặng là ốm");
        } else if (cannang <= 100) {
            System.out.println("Loại cân nặng là trung bình");
        } else {
            System.out.println("Loại cân nặng là mập");
        }

        System.out.println();
    }
    
    public String layTen() {
        return ten.toLowerCase();
    }
}
