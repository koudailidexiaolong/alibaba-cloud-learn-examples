package com.julong.service.impl;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

@EnableBinding(Sink.class) //定义消息为接收
public class RabbitMessageConsumerListener{

	@StreamListener(value=Sink.INPUT)
	public void readMessage(Message<String> message) {
		// TODO Auto-generated method stub
        System.out.println("reading2: " + System.currentTimeMillis() );
        String read = message.getPayload();
        System.out.println("reading2:结果 "+ read );
	}


	
	

}
