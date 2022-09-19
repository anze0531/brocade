package com.brocade.javaServer.domain.dao;

import com.brocade.javaServer.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberDao extends JpaRepository<Member, String> {
}
