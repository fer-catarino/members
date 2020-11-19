package com.catarino.members.repository;
import com.catarino.members.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembersRepository extends JpaRepository<Member,Integer> {
    Member findByName(String name);
}

