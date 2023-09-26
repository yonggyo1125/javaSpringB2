package exam01;

public class Student {
    private int grade; // 학년
    private int ban; // 반
    private char gender;

    private String name;

    public Student(int grade, int ban, char gender, String name) {
        this.grade = grade;
        this.ban = ban;
        this.gender = gender;
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", ban=" + ban +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }
}
