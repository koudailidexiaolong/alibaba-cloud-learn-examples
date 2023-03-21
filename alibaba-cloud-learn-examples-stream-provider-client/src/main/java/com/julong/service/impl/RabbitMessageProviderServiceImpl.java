package com.julong.service.impl;

import javax.annotation.Resource;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import com.julong.service.RabbitMessageProviderService;

@EnableBinding(Source.class) //定义消息为发送端
public class RabbitMessageProviderServiceImpl implements RabbitMessageProviderService {

	/**
	 * 定义消息推送管道
	 * @author julong
	 * @date 2023年3月1日 下午8:37:03
	 */
	@Resource
	private MessageChannel output;
	
	@Override
	public boolean sendMessage() {
		// TODO Auto-generated method stub
		String message ="测试消息:";
        System.out.println("Sending: "+ message + System.currentTimeMillis() );
        boolean send = output.send(MessageBuilder.withPayload(message).build());
        System.out.println("Sending:结果 "+ send );
		return send;
	}

}
