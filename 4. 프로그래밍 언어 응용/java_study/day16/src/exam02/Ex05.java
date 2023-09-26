package exam02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {
        long sdate = System.currentTimeMillis();
        try (FileInputStream fis = new FileInputStream("docs.zip");
            FileOutputStream fos = new FileOutputStream("copied1.zip")) {

            while(fis.available() > 0) {
                fos.write(fis.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long edate = System.currentTimeMillis();
        System.out.printf("걸린 시간 : %d%n", edate - sdate);
    }
}
