package exam03.models.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class InfoService {

    @Autowired
    private MemberDao memberDao;

    private DateTimeFormatter formatter;

    @Autowired(required = false)
    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public void print() {
        List<Member> members = memberDao.gets();
        members.stream().map(this::toConvert).forEach(System.out::println);
    }

    private Member toConvert(Member member) {
        if (formatter == null) {
            return member;
        }

        String regDtStr = formatter.format(member.getRegDt());
        member.setRegDtStr(regDtStr);

        return member;
    }
}
