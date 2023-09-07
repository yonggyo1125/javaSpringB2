package exam01;

public class Ex12 {
    public static void main(String[] args) {
        //int rank = 4;
        char rank = 'A';
        switch(rank) {
            case 'A':
                System.out.println("금메달!");
                break;
            case 'B':
                System.out.println("은메달!");
                break;
            case 'C':
                System.out.println("동메달!");
                break;
            default :
                System.out.println("입상!");
        }
    }
}
