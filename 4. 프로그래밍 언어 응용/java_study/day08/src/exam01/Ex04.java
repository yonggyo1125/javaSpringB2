package exam01;

public class Ex04 {
    public static void main(String[] args) {
        LoginService service = new LoginService();
        //try {
            service.login("user01", new String("1234"));

        //} catch (UserIdException | UserPwException e) {
         //   System.out.println(e.getMessage());
        //}
    }
}
