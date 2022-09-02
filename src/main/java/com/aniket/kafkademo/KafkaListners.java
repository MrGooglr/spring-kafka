package com.aniket.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListners {

    @KafkaListener(topics = "aniket")
    void listner(String data){
    System.out.println("Listner got data: "+data+" ");
    }

}
