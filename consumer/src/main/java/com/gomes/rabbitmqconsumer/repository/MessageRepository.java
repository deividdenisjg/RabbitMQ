package com.gomes.rabbitmqconsumer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gomes.rabbitmqconsumer.model.MessageModel;

@Repository
public interface MessageRepository extends MongoRepository<MessageModel, String> {
    
}
