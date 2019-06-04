package com.db.hack.wise.controller;

import com.db.hack.wise.dao.MemberRepository;
import com.db.hack.wise.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jones_vinu on 6/4/2019.
 */


@RestController
public class RegistrationController {

    @Autowired
    private MemberRepository memberRepository;

    @PostMapping("/members/create")
    void registerMember(Member member){
        member.setCreatedDate(new Date());
        memberRepository.save(member);
    }

    @GetMapping("/members/all")
    Iterable <Member> getUser(){
       return memberRepository.findAll();
    }



}
