package HuongDoiTuong;

/**
 *
 * @author PC
 */
public class HocSinh {

    String ten;
    int tuoi;
    String tinhcach;
    String nhanSac;

//    public HocSinh() {
//        ten = "thao bang";
//        tuoi = 12;
//        System.out.println(ten + " " + tuoi);
//    }
    public HocSinh(String message1, int message2) {
        ten = message1;
        tuoi = message2;
        System.out.println(ten + " " + tuoi);
//        congTuoi();
    }

    public void congTuoi() {
        tuoi = tuoi + 20;
        System.out.println(tuoi);
    }
//    
//    public HocSinh(int message1) {
//        System.out.println(message1);
//    }
}
