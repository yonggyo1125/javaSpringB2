package exam01;

public class Student {
    int id; // 학번 
    String name; // 이름
    String subject; // 전공과목

    void showInfo() {
        System.out.printf("id=%d, name=%s, subject=%s%n", id, name, subject);
    }
}