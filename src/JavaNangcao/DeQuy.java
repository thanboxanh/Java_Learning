package JavaNangcao;

/**
 *
 * @author ThanBoXanh
 */
public class DeQuy {
    
    static void intSo() throws InterruptedException {
        int n = 10;
        for(int i = 0; i <= n; i++) {
            System.out.println(i);
            Thread.sleep(500);
        }
    }
    
    static String taoChuoi() {
        String chuoi = "hello";
        System.out.println(chuoi);
        return chuoi;
    }
    
    public static void main(String[] args) throws InterruptedException {
//        intSo();
//        String ketqua = taoChuoi();
//        System.out.println(ketqua);
    }
}
