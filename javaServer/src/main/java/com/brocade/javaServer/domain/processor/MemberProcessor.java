package com.brocade.javaServer.domain.processor;

import com.brocade.javaServer.domain.dao.MemberDao;
import com.brocade.javaServer.domain.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MemberProcessor {

    @Autowired
    private MemberDao memberDao;

    public List<Member> findAll() {
        return memberDao.findAll();
    }

    public Member findById(String id) {
        return memberDao.findById(id).orElseThrow();
    }
}
