package com.aniket.kafkademo;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/msgs")
public class MeaagseController {

    private KafkaTemplate<String,String> kafkaTemplate;

    public MeaagseController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public void publish(@RequestBody String message) {
            kafkaTemplate.send("aniket",message);
    }

}
