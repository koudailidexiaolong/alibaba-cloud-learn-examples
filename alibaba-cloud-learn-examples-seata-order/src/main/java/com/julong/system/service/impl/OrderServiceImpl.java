package com.julong.system.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julong.response.CommonResult;
import com.julong.system.dao.OrderDao;
import com.julong.system.dao.entity.AccountInfo;
import com.julong.system.dao.entity.OrderInfo;
import com.julong.system.dao.entity.StorageInfo;
import com.julong.system.service.AccountService;
import com.julong.system.service.OrderService;
import com.julong.system.service.StorageService;

import io.seata.spring.annotation.GlobalTransactional;

/**
 * 业务类
 * @author julong
 * @date 2023/2/26 21:30
 * @desc
 */
@Service
public class OrderServiceImpl implements OrderService {

	public static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);
	
    @Autowired
    private OrderDao orderDaoImpl;
    
    @Resource
    private AccountService accountServiceImpl;
    
    @Resource
    private StorageService storageServiceImpl;

	@Override
	public OrderInfo getOrder(int id) throws Exception {
		// TODO Auto-generated method stub
		return this.orderDaoImpl.selectByPrimaryKey(id);
	}

	@Override
	public int saveOrder(OrderInfo record) throws Exception {
		// TODO Auto-generated method stub
		return this.orderDaoImpl.insertSelective(record);
	}

	
	@Override
	@GlobalTransactional(name="tx_seata_order",rollbackFor=Exception.class)
	public int updateOrder(int id) throws Exception {
		// TODO Auto-generated method stub
		OrderInfo order = new OrderInfo();
		order.setId(id);
		order.setMoney(99);
		int result = this.orderDaoImpl.updateByPrimaryKey(order);
		logger.info("订单执行结果：{}",result);
		AccountInfo record = new AccountInfo();
		record.setId(id);
		record.setMoney(99);
		CommonResult commonResult1 = this.accountServiceImpl.updateAccount(record);
		logger.info("账户执行结果：{}",commonResult1);
		StorageInfo storageInfo = new StorageInfo();
		storageInfo.setId(id);
		storageInfo.setCount(99);
		CommonResult commonResult = this.storageServiceImpl.updateStorage(storageInfo);
		logger.info("库存执行结果：{}",commonResult);
		return 1;
	}
    
	
    
}
