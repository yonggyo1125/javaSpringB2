package exam01;

import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toCollection;

public class Ex01 {
    private static List<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 20).forEach(Ex01::add);

        LinkedList<String> names = students.stream().map(Student::getName)
                .collect(toCollection(LinkedList::new));

        System.out.println(names);

        /**
        Set<Integer> bans = students.stream()
                                .map(Student::getBan)
                                //.distinct()
                                .collect(Collectors.toSet());
        System.out.println(bans);
         */
    }

    private static void add(int i) {
        int grade = (int)(Math.random() * 3) + 1;
        int ban = (int)(Math.random() * 3) + 1;
        char gender = (new Random()).nextBoolean() ? 'F':'M';

        students.add(new Student(grade, ban, gender, "학생" + i));
    }

}