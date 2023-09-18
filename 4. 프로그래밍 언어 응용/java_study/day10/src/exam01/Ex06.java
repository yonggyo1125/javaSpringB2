package exam01;

public class Ex06 {
    public static void main(String[] args) {
        String[] mobiles = { "010-0000-0000", "010-1000-0000"};
        String[] names = { "이름1", "이름2" };
        // 이름(전화번호)

        for (int i = 0; i < names.length; i++) {
            /**
             * %s : 문자열
             * %c : 문자 1개
             * %d : 정수
             * %f : 실수
             * %n : 줄개행 문자(\n)
             */
            String str = String.format("%s(%s)", names[i], mobiles[i]);
            System.out.println(str);
        }
    }
}
