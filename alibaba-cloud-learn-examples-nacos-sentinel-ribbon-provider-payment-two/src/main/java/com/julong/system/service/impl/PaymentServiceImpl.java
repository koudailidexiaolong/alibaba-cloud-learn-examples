package com.julong.system.service.impl;

import com.julong.system.dao.PaymentDao;
import com.julong.system.dao.entity.PaymentInfo;
import com.julong.system.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    
    
    
}
