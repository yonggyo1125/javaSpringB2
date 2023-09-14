package exam01;

public class Ex04 {
    public static void main(String[] args) {
        LoginService service = new LoginService();
        //try {
            service.login("user01", "12345");

        //} catch (UserIdException | UserPwException e) {
         //   System.out.println(e.getMessage());
        //}
    }
}
