package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test1.txt")) {
            int ch = fis.read(); // 1바이트 - -127~126 / unsigned byte : 0~255, -1
            System.out.println((char)ch);

            ch = fis.read();
            System.out.println((char)ch);

            ch = fis.read();
            System.out.println((char)ch);

            ch = fis.read();
            System.out.println((char)ch);

            ch = fis.read();
            System.out.println(ch); // -1 : 다 읽은 상태

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
