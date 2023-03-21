package com.julong.action;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //手动刷新标签
public class IndexAction {

	/**
	 * 此信息为远程配置信息
	 * @author julong
	 * @date 2023年3月1日 下午12:50:13
	 */
	@Value("${welcome.message}")
	private String message;
	
	@GetMapping(value="")
	public String readConfig(){
		
		return "test git client!"+message;
	}
}
