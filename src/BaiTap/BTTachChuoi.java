package BaiTap;

/**
 *
 * @author ThanBoXanh
 */
public class BTTachChuoi {
    
    static void tachChuoi() {
        String a = "hello world";
        String[] array = a.split("o");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    static void catChuoi() {
        String a = "hello world";
        String b = a.substring(3, 15);
        System.out.println(b);
    }
    
    static void tachKitu() {
        String a = "HELLO WORLD!!!";
        String[] array = a.split("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
    
    static void daoNguocMang() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        
        for (int i = a.length - 1; i >= 0; i--) {
            b[i] = a[i];
            System.out.println(b[i]);
        }
    }
    
    static void daoNguocChuoi() {
        String a = "thanboxanh";
        String[] b = a.split("");
        //in ra olleh;
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i]);
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        daoNguocChuoi(); 
    }
}
