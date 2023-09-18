package exam02;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while(true) {
                System.out.print("두 수를 입력 하세요 (예 : 100 200) : ");
                String line = br.readLine();
                if (line.equals("q")) {
                    break;
                }

                String[] lines = line.split("\\s+");
                int num1 = Integer.parseInt(lines[0]);
                int num2 = Integer.parseInt(lines[1]);
                System.out.printf("두 수의 합 : %d%n", num1 + num2);
            }
    }
}
