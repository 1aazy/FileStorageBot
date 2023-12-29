package com.max.configuration;

import com.max.model.RabbitQueue;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfiguration {
    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public Queue textMessage() {
        return new Queue(RabbitQueue.TEXT_MESSAGE_UPDATE);
    }

    @Bean
    public Queue docMessage() {
        return new Queue(RabbitQueue.DOC_MESSAGE_UPDATE);
    }

    @Bean
    public Queue photoMessage() {
        return new Queue(RabbitQueue.PHOTO_MESSAGE_UPDATE);
    }

    @Bean
    public Queue answerMessage() {
        return new Queue(RabbitQueue.ANSWER_MESSAGE);
    }
}
