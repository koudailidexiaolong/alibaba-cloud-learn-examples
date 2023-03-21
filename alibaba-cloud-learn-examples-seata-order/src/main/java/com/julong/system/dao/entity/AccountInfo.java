package com.julong.system.dao.entity;

public class AccountInfo {
    /**
     * 
     * This field corresponds to the database column tbl_account.id
     *
     * @author julong 2023-03-07 07:55:08
     */
    private Integer id;

    /**
     * 
     * This field corresponds to the database column tbl_account.user_id
     *
     * @author julong 2023-03-07 07:55:08
     */
    private String userId;

    /**
     * 
     * This field corresponds to the database column tbl_account.money
     *
     * @author julong 2023-03-07 07:55:08
     */
    private Integer money;

    /**
     * 
     * 
     * This method returns the value of the database column tbl_account.id
     *
     * @return the value of tbl_account.id
     *
     * @author julong 2023-03-07 07:55:08
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * 
     * This method sets the value of the database column tbl_account.id
     *
     * @param id the value for tbl_account.id
     *
     * @author julong 2023-03-07 07:55:08
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * 
     * This method returns the value of the database column tbl_account.user_id
     *
     * @return the value of tbl_account.user_id
     *
     * @author julong 2023-03-07 07:55:08
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 
     * 
     * This method sets the value of the database column tbl_account.user_id
     *
     * @param userId the value for tbl_account.user_id
     *
     * @author julong 2023-03-07 07:55:08
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 
     * 
     * This method returns the value of the database column tbl_account.money
     *
     * @return the value of tbl_account.money
     *
     * @author julong 2023-03-07 07:55:08
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * 
     * 
     * This method sets the value of the database column tbl_account.money
     *
     * @param money the value for tbl_account.money
     *
     * @author julong 2023-03-07 07:55:08
     */
    public void setMoney(Integer money) {
        this.money = money;
    }
}