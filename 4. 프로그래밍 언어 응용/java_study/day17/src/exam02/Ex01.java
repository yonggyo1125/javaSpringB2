package exam02;

import java.io.File;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) throws IOException, InterruptedException {
        //File file = new File("D:/uploads/test.txt");
        //file.createNewFile();
        File dir = new File("D:/uploads");
        File file = File.createTempFile("tmp", ".log", dir);
        String path = file.getAbsolutePath();
        System.out.println(path);
        file.deleteOnExit();

        Thread.sleep(5000);
        System.out.println("종료!");
    }
}
