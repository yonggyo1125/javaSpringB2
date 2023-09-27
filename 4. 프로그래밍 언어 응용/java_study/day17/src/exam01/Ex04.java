package exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04 {
    public static void main(String[] args) throws IOException {
        System.out.print("아무 문자 입력 : ");
        //char ch = (char)System.in.read();
        //System.out.println(ch);
        //InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(line);

        //char ch = (char)isr.read();
        //System.out.println(ch);

    }
}
