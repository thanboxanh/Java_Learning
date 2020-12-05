/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaNangcao;

import java.io.FileReader;
 
public class FileReaderExample {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("D:\\Garena-v2.0-VN.exe");
        int i = fr.read();
        long t1 = System.currentTimeMillis();
        StringBuilder b = new StringBuilder();
        while (i != -1) {
            System.out.print((char) i);
            i = fr.read();
//            b.append((char) i);
//            b = b + (char) i;
        }
//        System.out.print(b);
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
        System.out.println();
        fr.close();
    }
}

                        