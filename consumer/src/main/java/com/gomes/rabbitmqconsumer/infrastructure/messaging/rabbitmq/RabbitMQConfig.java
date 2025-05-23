package com.gomes.rabbitmqconsumer.infrastructure.messaging.rabbitmq;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;

public class RabbitMQConfig {

    public static final String QUEUE = "myQueue";
    public static final String EXCHANGE = "myExchange";
    public static final String ROUTING_KEY = "myQueue.rounting.key";

    @Bean
    public Queue myQueue() {
        return new Queue(QUEUE);
    }

    @Bean
    public DirectExchange myExchange() {
        return new DirectExchange(EXCHANGE);
    }

    @Bean
    public Binding binding(Queue myQueue, TopicExchange myExchange) {
        return BindingBuilder.bind(myQueue).to(myExchange).with(ROUTING_KEY);
    }
    
}
