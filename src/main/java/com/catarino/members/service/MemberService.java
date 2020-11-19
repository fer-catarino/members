package com.catarino.members.service;

import com.catarino.members.entity.Member;
import com.catarino.members.repository.MembersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MembersRepository repository;

    public Member saveMember(Member member) {
        return repository.save(member);
    }

    public List<Member> saveMembers(List<Member> members) {
        return repository.saveAll(members);
    }

    public List<Member> getMembers() {
        return repository.findAll();
    }

    public Member getMemberById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Member getMemberByName(String name) {
        return repository.findByName(name);
    }

    public String deleteMember(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Member updateMember(Member member) {
        Member existingMember = repository.findById(member.getId()).orElse(null);
        existingMember.setName(member.getName());
        return repository.save(existingMember);
    }


}

