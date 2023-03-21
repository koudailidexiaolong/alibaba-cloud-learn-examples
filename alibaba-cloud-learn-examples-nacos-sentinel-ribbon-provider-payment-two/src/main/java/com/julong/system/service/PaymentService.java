package com.julong.system.service;

import com.julong.system.dao.entity.PaymentInfo;

/**
 * @author julong
 * @date 2023/2/26 21:18
 * @desc
 */
public interface PaymentService {

    /**
     * 根据编号查询数据
     * @param paymentId
     * @return
     * @throws Exception
     * @author julong
     * @date 2023年2月27日 上午9:46:50
     * @desc
     */
    public abstract PaymentInfo selectPaymentInfo(Long paymentId) throws Exception;
    
    /**
     *  新增数据
     * @param record
     * @return
     * @throws Exception
     * @author julong
     * @date 2023年2月27日 上午9:47:07
     * @desc
     */
    public abstract int savePayment(PaymentInfo record) throws Exception;
}
