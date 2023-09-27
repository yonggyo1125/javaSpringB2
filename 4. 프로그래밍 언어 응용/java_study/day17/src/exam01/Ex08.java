package exam01;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex08 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("score.dat");
            DataInputStream dis = new DataInputStream(fis)) {
            int total = 0, cnt = 0;
            try {
                while (true) {
                    int score = dis.readInt();
                    total += score;
                    cnt++;
                }
            } catch (EOFException e) {
                double avg = total / (double)cnt;
                System.out.printf("총 합계 : %d, 평균 : %.2f%n", total, avg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
