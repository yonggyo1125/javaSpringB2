package exam01;

import java.util.LinkedList;
import java.util.Queue;

public class Ex05 {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();
        names.offer("이름1");
        names.offer("이름2");
        names.offer("이름3");

        while(names.size() > 0) {
            System.out.println(names.poll());
        }
    }
}
