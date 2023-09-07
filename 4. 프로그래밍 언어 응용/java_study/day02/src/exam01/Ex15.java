package exam01;

public class Ex15 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }

            total += i;

            /**
            if (num % 2 == 1) { // 홀수
                total += num;
            }
             */
                /*
                if (num == 50) {
                    break;
                }
                 */
        }

        System.out.println(total);
    }
}
