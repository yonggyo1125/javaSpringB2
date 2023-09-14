package exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 예외가 발생하든 하지 않던 무조건 실행되는 코드
            try {
                if (fis != null) fis.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("자원해제!");
        }
    }
}
