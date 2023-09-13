package exam03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex01 {
    public static void main(String[] args) {
        // FileNotFoundException
        try {
            FileInputStream fis = new FileInputStream("a.txt");
            System.out.println("이상 없음!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("중요한 코드!");
    }
}
