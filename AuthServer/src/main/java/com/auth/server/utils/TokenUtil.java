package com.auth.server.utils;

import com.auth.server.api.impl.AuthorizeImpl;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 *  token util
 */
public class TokenUtil {
    public static final Logger logger = LoggerFactory.getLogger(TokenUtil.class);

    /**
     * generate TOKEN
     * @return long
     */
    public static Long generate() {
        int hash = Math.abs(UUID.randomUUID().hashCode());
        return Long.valueOf(hash );

    }

    /**
     *
     * @param createTime
     * @return boolean
     */
    public static boolean judgeEmpire(Date createTime)  {
        Long milliseconds = Math.abs(createTime.getTime() - (new Date()).getTime());
        if(milliseconds > 7200000){
            return true;
        }
        return false;
    }
}
