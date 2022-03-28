package com.tylerdowney.SpringBootQAP3.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "member", path = "member")
public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByMemberLastName(@Param("memberLastName") String memberLastName);
}
