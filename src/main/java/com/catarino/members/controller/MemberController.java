package com.catarino.members.controller;

import com.catarino.members.entity.Member;
import com.catarino.members.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private MemberService service;

    @PostMapping("/addMember")
    public Member addMember(@RequestBody Member member) {
        return service.saveMember(member);
    }

    @PostMapping("/addMembers")
    public List<Member> addMembers(@RequestBody List<Member> members) {
        return service.saveMembers(members);
    }

    @GetMapping("/members")
    public List<Member> findAllMembers() {
        return service.getMembers();
    }

    @GetMapping("/memberById/{id}")
    public Member findMemberById(@PathVariable int id) {
        return service.getMemberById(id);
    }

    @GetMapping("/member/{name}")
    public Member findMemberByName(@PathVariable String name) {
        return service.getMemberByName(name);
    }

    @PutMapping("/update")
    public Member updateMember(@RequestBody Member member) {
        return service.updateMember(member);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMember(@PathVariable int id) {
        return service.deleteMember(id);
    }
}


