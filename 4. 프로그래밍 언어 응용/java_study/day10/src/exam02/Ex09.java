package exam02;

import java.io.IOException;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("두 수를 입력하세요 :");
            String line = sc.nextLine();
            if (line.equals("q")) break;

            String[] lines = line.split("\\s+");
            System.out.printf("두 수의 합 : %d%n",
                    Integer.parseInt(lines[0]) + Integer.parseInt(lines[1]));
        }
    }
}
