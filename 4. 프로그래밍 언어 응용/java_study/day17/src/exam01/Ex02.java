package exam01;

import java.io.FileWriter;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("test2.txt", true)) {
            fw.write("B안녕하세요.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
