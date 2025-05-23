package com.gomes.rabbitmqproducer.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import com.gomes.rabbitmqproducer.infrastructure.messaging.rabbitmq.RabbitMQConfig;

@Service
public class ProducerService {
    
    // Cria o template do RabbitMQ
    private final RabbitTemplate rabbitTemplate;

    public ProducerService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    // Converte e envia a mensagem para o RabbitMQ
    public void send(String menssage) {
        rabbitTemplate.convertAndSend(
            RabbitMQConfig.EXCHANGE,
            RabbitMQConfig.ROUTING_KEY,
            menssage
        );
    }

}
