package com.julong.system.dao.entity;

public class StorageInfo {
    /**
     * 
     * This field corresponds to the database column tbl_storage.id
     *
     * @author julong 2023-03-07 07:55:08
     */
    private Integer id;

    /**
     * 
     * This field corresponds to the database column tbl_storage.commodity_code
     *
     * @author julong 2023-03-07 07:55:08
     */
    private String commodityCode;

    /**
     * 
     * This field corresponds to the database column tbl_storage.count
     *
     * @author julong 2023-03-07 07:55:08
     */
    private Integer count;

    /**
     * 
     * 
     * This method returns the value of the database column tbl_storage.id
     *
     * @return the value of tbl_storage.id
     *
     * @author julong 2023-03-07 07:55:08
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * 
     * This method sets the value of the database column tbl_storage.id
     *
     * @param id the value for tbl_storage.id
     *
     * @author julong 2023-03-07 07:55:08
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * 
     * This method returns the value of the database column tbl_storage.commodity_code
     *
     * @return the value of tbl_storage.commodity_code
     *
     * @author julong 2023-03-07 07:55:08
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * 
     * 
     * This method sets the value of the database column tbl_storage.commodity_code
     *
     * @param commodityCode the value for tbl_storage.commodity_code
     *
     * @author julong 2023-03-07 07:55:08
     */
    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode == null ? null : commodityCode.trim();
    }

    /**
     * 
     * 
     * This method returns the value of the database column tbl_storage.count
     *
     * @return the value of tbl_storage.count
     *
     * @author julong 2023-03-07 07:55:08
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * 
     * This method sets the value of the database column tbl_storage.count
     *
     * @param count the value for tbl_storage.count
     *
     * @author julong 2023-03-07 07:55:08
     */
    public void setCount(Integer count) {
        this.count = count;
    }
}