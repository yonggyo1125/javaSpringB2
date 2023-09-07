package exam01;

public class Ex14 {
    public static void main(String[] args) {
        int num = 1, total = 0;

        do {
            total += num;
            num++;
        } while(num < 1);

        System.out.println(total);
    }
}
