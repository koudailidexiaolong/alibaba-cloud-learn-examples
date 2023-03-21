package com.julong.response;

/**
 * @author julong
 * @date 2023/2/26 14:31
 * @desc
 */
public class CommonResult<T> {

    /**
     * 返回码
     */
    private int code;
    /**
     * 返回消息
     */
    private String message;
    /**
     * 返回时间
     */
    private long times;
    /**
     * 返回对象
     */
    private T data = null;

    public CommonResult() {
    }

    public CommonResult(int code, String message) {
        this.code = code;
        this.message = message;
        this.times = System.currentTimeMillis();
    }

    
    public CommonResult(int code, String message, T data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
		this.times = System.currentTimeMillis();
	}

	/**
     * 返回码
     * @author julong
     * @date 2023-02-26 02:42:23
     * @return code
     */
    public int getCode() {
        return this.code;
    }

    /**
     * 返回码
     * @author julong
     * @date 2023-02-26 02:42:23
     * @param code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * 返回消息
     * @author julong
     * @date 2023-02-26 02:42:23
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * 返回消息
     * @author julong
     * @date 2023-02-26 02:42:23
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 返回时间
     * @author julong
     * @date 2023-02-26 02:42:23
     * @return times
     */
    public long getTimes() {
        return this.times;
    }

    /**
     * 返回时间
     * @author julong
     * @date 2023-02-26 02:42:23
     * @param times
     */
    public void setTimes(long times) {
        this.times = times;
    }

    /**
     * 返回对象
     * @author julong
     * @date 2023-02-26 02:42:23
     * @return data
     */
    public T getData() {
        return this.data;
    }

    /**
     * 返回对象
     * @author julong
     * @date 2023-02-26 02:42:23
     * @param data
     */
    public void setData(T data) {
        this.data = data;
    }
}
