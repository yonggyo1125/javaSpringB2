package exam01;

public class Student {
    static int id; // 학번
    String name; // 이름
    String subject; // 전공과목

    public Student() {}

    public Student(int _id, String _name, String _subject) {
        // 반환값 정의 X, return X - 무조건 반환값은 객체의 주소값
        // 객체 생성 이후에 해야될 작업들 ....
        // 멤버 변수의 초기화 작업을 주로 진행
        id = _id;
        name = _name;
        subject = _subject;
    }

    void showInfo() {

        System.out.printf("id=%d, name=%s, subject=%s%n", id, name, subject);
    }
}