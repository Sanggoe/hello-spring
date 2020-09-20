package com.sanggoe.hellospring;

import com.sanggoe.hellospring.repository.MemberRepository;
import com.sanggoe.hellospring.repository.MemoryMemberRepository;
import com.sanggoe.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
