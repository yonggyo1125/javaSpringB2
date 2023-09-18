package exam01;

public class Ex08 {
    public static void main(String[] args) {
        // substring(s,e) s 이상 e 미만
        // substring(s) : s 위치부터 끝까지
        // lastIndexOf

        String fileName = "abc.def.txt";
        String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
        System.out.println(extension);
    }
}
