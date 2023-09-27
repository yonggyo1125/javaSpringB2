package exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ex09 {
    public static void main(String[] args) throws IOException  {
        //System.err.println("에러!");
        PrintStream ps = new PrintStream(new FileOutputStream("log.txt", true));
        System.setErr(ps);

        int result = 10 / 0;


    }
}
