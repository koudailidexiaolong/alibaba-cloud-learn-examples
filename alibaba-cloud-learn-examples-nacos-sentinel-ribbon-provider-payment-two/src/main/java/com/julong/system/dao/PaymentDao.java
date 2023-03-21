package com.julong.system.dao;

import com.julong.system.dao.entity.PaymentInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 支付模块
 * @author julong
 * @date 2023年02月26日 21:05:17
 * @desc
 */
@Mapper
@Repository
public interface PaymentDao {
    public abstract int deleteByPrimaryKey(Long paymentId) throws Exception;

    public abstract int insert(PaymentInfo record) throws Exception;

    /**
     * 新增数据
     * @param record
     * @return
     * @throws Exception
     * @author julong
     * @date 2023年2月27日 上午9:46:37
     * @desc
     */
    public abstract int insertSelective(PaymentInfo record) throws Exception;

    /**
     * 根据编号查询数据
     * @param paymentId
     * @return
     * @throws Exception
     * @author julong
     * @date 2023年2月27日 上午9:46:28
     * @desc
     */
    public abstract PaymentInfo selectByPrimaryKey(Long paymentId) throws Exception;

    public abstract PaymentInfo selectBySelective(PaymentInfo record) throws Exception;

    public abstract int updateByPrimaryKeySelective(PaymentInfo record) throws Exception;

    public abstract int updateByPrimaryKey(PaymentInfo record) throws Exception;
}