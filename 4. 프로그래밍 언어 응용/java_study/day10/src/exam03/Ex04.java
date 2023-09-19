package exam03;

import static exam03.Transportation.*;

public class Ex04 {
    public static void main(String[] args) {
       //Transportation trans = Transportation.BUS;
        Transportation trans = BUS;
       System.out.println(trans.getTitle());
       System.out.println(trans.getTotal(10));
    }
}
