package org.bspoke.no.kafkasvr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumer {
    private final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "bspoke_kafka_sample", groupId = "group_id")
    public void kafkaconsumer(String message) throws IOException {
        logger.info(String.format("consumer start -> Consumed message -> %s", message));
    }
}
