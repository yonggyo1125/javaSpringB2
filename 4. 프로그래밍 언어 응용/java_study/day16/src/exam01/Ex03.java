package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Ex03 {
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 20).forEach(Ex03::add);

    }

    private static void add(int i) {
        int grade = (int)(Math.random() * 3) + 1;
        int ban = (int)(Math.random() * 3) + 1;
        char gender = (new Random()).nextBoolean() ? 'F':'M';

        students.add(new Student(grade, ban, gender, "학생" + i));
    }
}
