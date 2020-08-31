package JavaNangcao;

/**
 *
 * @author PC
 */
public class DemChuCai {

    public static void main(String[] args) {
        int count = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            count++;
            System.out.print(i);
            System.out.print(" ");
            System.out.println((char)(int) i);
        }
    }
}
