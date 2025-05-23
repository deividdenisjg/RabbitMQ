package com.gomes.rabbitmqconsumer.infrastructure.messaging.rabbitmq;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;

public class RabbitMQConfig {

    // Variaveis com nomes da fila, exchange e routing_key
    public static final String QUEUE = "myQueue";
    public static final String EXCHANGE = "myExchange";
    public static final String ROUTING_KEY = "myQueue.rounting.key";

    // Cria fila com nome myQueue
    @Bean
    public Queue myQueue() {
        return new Queue(QUEUE);
    }

    // Cria o exchange chamado myExchange responsável pela entrega das mensagens geradas pelo produtor a fila
    @Bean
    public DirectExchange myExchange() {
        return new DirectExchange(EXCHANGE);
    }

    // Cria o Binding que indica para qual fila o exchange deve enviar a mensagem
    @Bean
    public Binding binding(Queue myQueue, TopicExchange myExchange) {
        return BindingBuilder.bind(myQueue).to(myExchange).with(ROUTING_KEY);
    }
    
}
