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

    void showInfo() { // 인스턴스 메서드 -> 객체 생성 이후 호출 가능

        System.out.printf("id=%d, name=%s, subject=%s%n", id, name, subject);

        staticMethod();// 인스턴스 자원에서 정적 자원 접근 O
        
    }

    static void staticMethod() { // 처음 부터 호출 가능 -> 클래스명으로 접근
        System.out.println("정적 메서드!");
        //this.name = "이이름";
        //showInfo();
    }
}