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
     * ηζζΆι΄
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
