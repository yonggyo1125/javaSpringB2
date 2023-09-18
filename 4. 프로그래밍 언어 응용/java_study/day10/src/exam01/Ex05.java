package exam01;

public class Ex05 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("ABC")
                .append("DEF")
                .append("GHI"); // 메서드 체이닝

        String str = sb.toString();
        System.out.println(str);
        
    }
}
