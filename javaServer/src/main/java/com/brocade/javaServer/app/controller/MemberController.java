package com.brocade.javaServer.app.controller;

import com.brocade.javaServer.domain.entity.Member;
import com.brocade.javaServer.domain.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @QueryMapping
    public Member member(@Argument final String id) {
        return memberService.findById(id);
    }

    @QueryMapping
    public List<Member> members() {
        return memberService.findAll();
    }

}
