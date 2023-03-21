package com.julong.system.dao.entity;

public class OrderInfo {
    /**
     * 
     * This field corresponds to the database column tbl_order.id
     *
     * @author julong 2023-03-07 07:55:08
     */
    private Integer id;

    /**
     * 
     * This field corresponds to the database column tbl_order.user_id
     *
     * @author julong 2023-03-07 07:55:08
     */
    private String userId;

    /**
     * 
     * This field corresponds to the database column tbl_order.commodity_code
     *
     * @author julong 2023-03-07 07:55:08
     */
    private String commodityCode;

    /**
     * 
     * This field corresponds to the database column tbl_order.count
     *
     * @author julong 2023-03-07 07:55:08
     */
    private Integer count;

    /**
     * 
     * This field corresponds to the database column tbl_order.money
     *
     * @author julong 2023-03-07 07:55:08
     */
    private Integer money;

    /**
     * 
     * 
     * This method returns the value of the database column tbl_order.id
     *
     * @return the value of tbl_order.id
     *
     * @author julong 2023-03-07 07:55:08
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * 
     * This method sets the value of the database column tbl_order.id
     *
     * @param id the value for tbl_order.id
     *
     * @author julong 2023-03-07 07:55:08
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * 
     * This method returns the value of the database column tbl_order.user_id
     *
     * @return the value of tbl_order.user_id
     *
     * @author julong 2023-03-07 07:55:08
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 
     * 
     * This method sets the value of the database column tbl_order.user_id
     *
     * @param userId the value for tbl_order.user_id
     *
     * @author julong 2023-03-07 07:55:08
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 
     * 
     * This method returns the value of the database column tbl_order.commodity_code
     *
     * @return the value of tbl_order.commodity_code
     *
     * @author julong 2023-03-07 07:55:08
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * 
     * 
     * This method sets the value of the database column tbl_order.commodity_code
     *
     * @param commodityCode the value for tbl_order.commodity_code
     *
     * @author julong 2023-03-07 07:55:08
     */
    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode == null ? null : commodityCode.trim();
    }

    /**
     * 
     * 
     * This method returns the value of the database column tbl_order.count
     *
     * @return the value of tbl_order.count
     *
     * @author julong 2023-03-07 07:55:08
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * 
     * This method sets the value of the database column tbl_order.count
     *
     * @param count the value for tbl_order.count
     *
     * @author julong 2023-03-07 07:55:08
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 
     * 
     * This method returns the value of the database column tbl_order.money
     *
     * @return the value of tbl_order.money
     *
     * @author julong 2023-03-07 07:55:08
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * 
     * 
     * This method sets the value of the database column tbl_order.money
     *
     * @param money the value for tbl_order.money
     *
     * @author julong 2023-03-07 07:55:08
     */
    public void setMoney(Integer money) {
        this.money = money;
    }
}