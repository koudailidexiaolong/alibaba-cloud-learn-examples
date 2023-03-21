package com.julong.system.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.julong.response.CommonResult;
import com.julong.system.dao.entity.OrderInfo;
import com.julong.system.service.OrderService;

@RestController
public class OrderAction {

	private static final Logger logger = LoggerFactory.getLogger(OrderAction.class);
	
	@Autowired
	private OrderService orderServiceImpl;
	
	/**
	 * 查询数据
	 * @param paymentId
	 * @return
	 * @author julong
	 * @date 2023年2月26日 下午10:06:23
	 * @desc
	 */
	@GetMapping(value="/order/get/{id}")
	public CommonResult<OrderInfo> getOrderById(@PathVariable("id") int id){
		OrderInfo orderInfo = null;
		try {
			orderInfo = this.orderServiceImpl.getOrder(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(orderInfo != null){
			return new CommonResult<OrderInfo>(200,"查询成功",orderInfo);
		}else{
			return new CommonResult<OrderInfo>(500,"查询失败");
		}
	}
	
	/**
	 * 测试seata
	 * @param id
	 * @return
	 * @author julong
	 * @date 2023年3月16日 下午9:36:56
	 * @desc
	 */
	@GetMapping(value="/order/update/{id}")
	public CommonResult<OrderInfo> updateOrderById(@PathVariable("id") int id){
		int result = -1;
		try {
			result = this.orderServiceImpl.updateOrder(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result > -1){
			return new CommonResult<OrderInfo>(200,"查询成功");
		}else{
			return new CommonResult<OrderInfo>(500,"查询失败");
		}
	}
	
	
}
