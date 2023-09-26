package exam02;

import java.io.*;

public class Ex06 {
    public static void main(String[] args) {

        long sdate = System.currentTimeMillis();

        try (FileInputStream fis = new FileInputStream("docs.zip");
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream("copied2.zip");
            BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            while(bis.available() > 0) {
                bos.write(bis.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long edate = System.currentTimeMillis();
        System.out.printf("걸린 시간 : %d%n", edate - sdate);
    }
}
