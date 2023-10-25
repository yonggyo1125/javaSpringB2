package exam04.models.member;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InfoService {

    @NonNull
    private MemberDao memberDao;


    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd");

    @Autowired
    public void setFormatter(@Nullable DateTimeFormatter formatter) {
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
