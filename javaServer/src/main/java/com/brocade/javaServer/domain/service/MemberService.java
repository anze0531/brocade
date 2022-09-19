package com.brocade.javaServer.domain.service;

import com.brocade.javaServer.domain.entity.Member;
import com.brocade.javaServer.domain.processor.MemberProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberProcessor memberProcessor;

    public List<Member> findAll() {
        return memberProcessor.findAll();
    }

    public Member findById(String id) {
        return memberProcessor.findById(id);
    }
}
