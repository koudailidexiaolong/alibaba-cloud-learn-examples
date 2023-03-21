package com.julong.system.service;

import com.julong.system.dao.entity.OrderInfo;

/**
 * @author julong
 * @date 2023/2/26 21:18
 * @desc
 */
public interface OrderService {

    /**
     * 据编号查询数据
     * @param id
     * @return
     * @throws Exception
     * @author julong
     * @date 2023年3月7日 下午8:38:55
     * @desc
     */
    public abstract OrderInfo getOrder(int id) throws Exception;
    
    /**
     * 新增数据
     * @param record
     * @return
     * @throws Exception
     * @author julong
     * @date 2023年3月7日 下午8:39:08
     * @desc
     */
    public abstract int saveOrder(OrderInfo record) throws Exception;
    
    public abstract int updateOrder(int id) throws Exception;
}
