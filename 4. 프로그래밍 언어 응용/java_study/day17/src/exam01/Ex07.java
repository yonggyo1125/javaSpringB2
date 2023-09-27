package exam01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("score.dat");
            DataOutputStream dos = new DataOutputStream(fos)) {
            int[] scores = {100, 90, 88, 98, 45, 33, 78};
            for (int score : scores) {
                dos.writeInt(score);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
