package org.koreait.repositories;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.koreait.entities.Member;

public interface MemberRepository extends CrudRepository<Member, Long> {

    @Query("SELECT SEQ_MEMBER.nextval FROM DUAL")
    long getSequence();
}
