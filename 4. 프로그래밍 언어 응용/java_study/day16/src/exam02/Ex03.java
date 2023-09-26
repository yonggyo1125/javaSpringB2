package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("test1.txt")) {
            byte[] buffer = new byte[5];
            while(fis.available() > 0) {
                int ch = fis.read(buffer);
                for (byte b : buffer) {
                    System.out.print((char)b);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
