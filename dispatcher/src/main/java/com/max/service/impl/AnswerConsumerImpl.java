package com.max.service.impl;

import com.max.controller.UpdateProcessor;
import com.max.model.RabbitQueue;
import com.max.service.AnswerConsumer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

@Service
public class AnswerConsumerImpl implements AnswerConsumer {
    private final UpdateProcessor updateContoller;

    public AnswerConsumerImpl(UpdateProcessor updateContoller) {
        this.updateContoller = updateContoller;
    }

    @Override
    @RabbitListener(queues = RabbitQueue.ANSWER_MESSAGE)
    public void consume(SendMessage sendMessage) {
        updateContoller.setView(sendMessage);
    }
}
