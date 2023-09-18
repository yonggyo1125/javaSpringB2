package exam02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) throws IOException {
        int total = 0, cnt = 0;
        Scanner sc = new Scanner(new File("scores.txt"));
        while(sc.hasNext()) {
            int score = sc.nextInt();
            total += score;
            cnt++;
        }

        System.out.printf("합계 : %d, 평균: %.2f%n", total, total / Double.valueOf(cnt));
    }
}
