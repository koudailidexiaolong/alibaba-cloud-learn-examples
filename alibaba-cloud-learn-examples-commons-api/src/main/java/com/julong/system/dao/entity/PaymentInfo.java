package com.julong.system.dao.entity;

public class PaymentInfo {
    /**
     * 支付编号
     * This field corresponds to the database column payment.payment_id
     *
     * @author julong 2023-02-26 08:52:50
     */
    private Long paymentId;

    /**
     * 支付流水号
     * This field corresponds to the database column payment.payment_serial
     *
     * @author julong 2023-02-26 08:52:50
     */
    private String paymentSerial;

    /**
     * 支付编号
     * 
     * This method returns the value of the database column payment.payment_id
     *
     * @return the value of payment.payment_id
     *
     * @author julong 2023-02-26 08:52:50
     */
    public Long getPaymentId() {
        return paymentId;
    }

    /**
     * 支付编号
     * 
     * This method sets the value of the database column payment.payment_id
     *
     * @param paymentId the value for payment.payment_id
     *
     * @author julong 2023-02-26 08:52:50
     */
    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * 支付流水号
     * 
     * This method returns the value of the database column payment.payment_serial
     *
     * @return the value of payment.payment_serial
     *
     * @author julong 2023-02-26 08:52:50
     */
    public String getPaymentSerial() {
        return paymentSerial;
    }

    /**
     * 支付流水号
     * 
     * This method sets the value of the database column payment.payment_serial
     *
     * @param paymentSerial the value for payment.payment_serial
     *
     * @author julong 2023-02-26 08:52:50
     */
    public void setPaymentSerial(String paymentSerial) {
        this.paymentSerial = paymentSerial == null ? null : paymentSerial.trim();
    }
}