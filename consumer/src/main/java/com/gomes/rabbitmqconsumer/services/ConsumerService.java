package com.gomes.rabbitmqconsumer.services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gomes.rabbitmqconsumer.infrastructure.messaging.rabbitmq.RabbitMQConfig;
import com.gomes.rabbitmqconsumer.model.MessageModel;
import com.gomes.rabbitmqconsumer.repository.MessageRepository;

@Service
public class ConsumerService {

    // Injeta a dependencia da classe repository
    @Autowired
    private MessageRepository messageRepository;
    
    // Escuta as mensagens no RabbitMQ e salva no MongoDB
    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void received(String messageText) {
        MessageModel message = new MessageModel();
        message.setContent(messageText);
        messageRepository.save(message);

        System.out.println("Mensagem salva: " + messageText);
    }

}
