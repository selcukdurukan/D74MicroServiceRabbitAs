package com.ba.boost.rabbitmq.producer;

import com.ba.boost.config.rabbit.RabbitConfig;
import com.ba.boost.rabbitmq.model.MemberModel;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberRegisterProducer {

    private final RabbitTemplate rabbitTemplate;

    public void convertAndSendMessageMember(MemberModel member) {
        rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE, RabbitConfig.ROUTING_KEY, member);
    }
}
