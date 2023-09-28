package com.ba.boost.service;

import com.ba.boost.rabbitmq.model.MemberModel;
import com.ba.boost.rabbitmq.producer.MemberRegisterProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRegisterProducer memberProducer;

    public MemberModel register(MemberModel member) {
        memberProducer.convertAndSendMessageMember(member);
        return member;
    }

}
