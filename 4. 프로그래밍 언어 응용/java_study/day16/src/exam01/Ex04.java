package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex04 {
    private static List<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 20).forEach(Ex04::add);

        Map<String, List<Student>> students2 = students.stream()
                .collect(Collectors.groupingBy(s -> s.getGrade() +"_" + s.getBan()));
        System.out.println("--- 1학년 3반 ----");
        List<Student> students3 = students2.get("1_3");
        students3.stream().forEach(System.out::println);

        System.out.println("--- 2학년 2반 ----");
        List<Student> students4 = students2.get("2_2");
        students4.stream().forEach(System.out::println);
    }

    private static void add(int i) {
        int grade = (int)(Math.random() * 3) + 1;
        int ban = (int)(Math.random() * 3) + 1;
        char gender = (new Random()).nextBoolean() ? 'F':'M';

        students.add(new Student(grade, ban, gender, "학생" + i));
    }
}
