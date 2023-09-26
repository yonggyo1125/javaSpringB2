package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("test1.txt")) {
            byte[] buffer = new byte[5];
            while(fis.available() > 0) {
                int ch = fis.read(buffer);
                /*
                //System.out.println("바이트 수 : " + ch);
                for (byte b : buffer) {
                    System.out.print((char)b);
                }
                 */
                for (int i = 0; i < ch; i++) {
                    System.out.print((char)buffer[i]);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
