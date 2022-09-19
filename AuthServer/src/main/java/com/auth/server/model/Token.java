package com.auth.server.model;

import java.util.Date;

/**
 * token
 */
public class Token {

    /**
     * token
     */
    private String token;

    /**
     * 生成时间
     */
    private Date generateDate;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getGenerateDate() {
        return generateDate;
    }

    public void setGenerateDate(Date generateDate) {
        this.generateDate = generateDate;
    }
}
