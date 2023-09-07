package exam01;

public class Ex13 {
    public static void main(String[] args) {
        int num = 1, total = 0;

        while(num <= 100) {
           total += num;
           num++;
        }

        System.out.println(total);

        // 초기값 (int num = 1), 조건식 (num <= 100), 증감식 ( num++) -> 횟수에 통제 가능
    }
}
