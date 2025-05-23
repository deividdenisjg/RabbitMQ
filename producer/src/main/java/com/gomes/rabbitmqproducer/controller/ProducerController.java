package com.gomes.rabbitmqproducer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gomes.rabbitmqproducer.services.ProducerService;

@RestController
@RequestMapping("/api")
public class ProducerController {
    
    private final ProducerService producer;
 
    public ProducerController(ProducerService producer) {
        this.producer = producer;
    }

    @PostMapping("/send")
    public ResponseEntity<String> send(@RequestBody String message) {
        producer.send(message);
        return ResponseEntity.ok("Message sent: " + message);
    }

}
