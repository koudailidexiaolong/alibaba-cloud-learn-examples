package com.julong.system.service.impl;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julong.system.dao.PaymentDao;
import com.julong.system.dao.entity.PaymentInfo;
import com.julong.system.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

/**
 * 业务类
 * @author julong
 * @date 2023/2/26 21:30
 * @desc
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDaoImpl;

    @Override
    public PaymentInfo selectPaymentInfo(Long paymentId) throws Exception {
        return this.paymentDaoImpl.selectByPrimaryKey(paymentId);
    }

	@Override
	public int savePayment(PaymentInfo record) throws Exception {
		// TODO Auto-generated method stub
		return this.paymentDaoImpl.insertSelective(record);
	}

	@HystrixCommand(fallbackMethod="hystrixTimeoutHandler",commandProperties = {
		      @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value="3000")
		    })
	@Override
	public String testHystrix() throws Exception {
		// TODO Auto-generated method stub
		TimeUnit.SECONDS.sleep(5);
		return "请求正常";
	}
    
    /**
     * 失败调用方法
     * @return
     * @author julong
     * @date 2023年2月28日 下午2:33:42
     * @desc
     */
    public String hystrixTimeoutHandler(){
    	
    	return "请求异常";
    }

    
    /***************************服务熔断配置示例********************************/
    
    /**
     * 测试服务熔断
     * @return
     * @throws Exception
     * @author julong
     * @date 2023年2月28日 下午4:16:46
     * @desc
     */
    @Override
    @HystrixCommand(fallbackMethod = "circuitBreakerFallback",commandProperties = {
    		@HystrixProperty(name = "circuitBreaker.enabled",value="true"),//是否开启断路器   默认为true
    		@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value="10"),//请求次数   默认为20
    		@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value="10000"),//时间窗口期   默认为5000
    		@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value="50"),//失败率达到多少跳闸   默认为50
    })
    public String testCircuitBreaker(int id) {
    	// TODO Auto-generated method stub
    	if(id < 10){
    		throw new RuntimeException("数字过小！");
    	}
    	return "数字符合要求！";
    }
    
    public String circuitBreakerFallback(int id){
    	return "circuitBreakerFallback方法发生错误！请稍后再试！";
    }
    
    
}
