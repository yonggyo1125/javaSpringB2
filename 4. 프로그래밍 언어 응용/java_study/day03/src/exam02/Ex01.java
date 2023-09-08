package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1000;
        s1.name = "학생1";
        s1.subject = "과목1";

        s1.study();
        System.out.println(System.identityHashCode(s1));

        Student s2 = new Student();
        s2.id=1001;
        s2.name="학생2";
        s2.subject="과목2";
        s2.study();

        System.out.println(System.identityHashCode(s2));

        Student s3 = s2; // s2의 주소값
        s3.name = "학생3";
        s3.study();
        s2.study();
        System.out.println(System.identityHashCode(s3));
        System.out.println(s2 == s3);

        s1 = null;
    }
}
