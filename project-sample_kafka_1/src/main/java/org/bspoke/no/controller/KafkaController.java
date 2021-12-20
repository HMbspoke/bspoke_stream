package org.bspoke.no.controller;

import org.bspoke.no.kafkasvr.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final KafkaProducer kafkaProducer;

    @Autowired
    KafkaController(KafkaProducer producer) {
        this.kafkaProducer = producer;
    }

    @GetMapping(value = "/publish")
    public void sendKafkaMessage(@RequestParam("message") String message) {
        this.kafkaProducer.sendMessage(message);
    }
}
