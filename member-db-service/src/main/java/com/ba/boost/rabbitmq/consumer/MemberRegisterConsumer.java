package com.ba.boost.rabbitmq.consumer;

import com.ba.boost.rabbitmq.model.MemberModel;
import com.ba.boost.repository.entity.Member;
import com.ba.boost.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class MemberRegisterConsumer {
    private final MemberService memberService;

    @RabbitListener(queues = "queue-member")
    public void rabbitHandleFromQueue(MemberModel memberModel) {
        memberService.registerMember(Member.builder()
                .firstName(memberModel.getFirstName())
                .lastName(memberModel.getLastName())
                .email(memberModel.getEmail())
                .birthDate(memberModel.getBirthDate())
                .createdAt(new Date())
                .updatedAt(new Date())
                .build());
    }
}
