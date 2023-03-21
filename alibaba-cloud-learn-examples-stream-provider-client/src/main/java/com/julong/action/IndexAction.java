package com.julong.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.julong.service.RabbitMessageProviderService;

@RestController
public class IndexAction {

	@Autowired
	private RabbitMessageProviderService rabbitMessageProviderServiceImpl;
	
	@GetMapping("/send")
	public String sendMessage(){
		boolean result = this.rabbitMessageProviderServiceImpl.sendMessage();
		return "消息发送结果："+result;
	}
}
