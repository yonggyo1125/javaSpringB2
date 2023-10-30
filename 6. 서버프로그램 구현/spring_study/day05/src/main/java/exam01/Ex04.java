package exam01;

import config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Ex04 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);
        String sql = "INSERT INTO MEMBER (USER_NO, USER_ID, USER_PW, USER_NM, EMAIL) " +
                " VALUES (SEQ_MEMBER.nextval, ?, ?, ?, ?)";

        int affectedRows = jdbcTemplate.update(sql, "user03", "123456", "사용자03", "user03@test.org");

        System.out.println(affectedRows);

        ctx.close();
    }
}
