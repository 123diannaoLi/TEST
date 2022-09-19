package com.auth.server.utils;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class TokenUtilTest extends TestCase {

    @Test
    public void testGenerate() {
        TokenUtil tokenUtil = new TokenUtil();
        Long tokenValue = tokenUtil.generate();
        Assert.assertNotEquals(tokenValue-0l, 0);
    }

    @Test
    public void testJudgeEmpire() {
        TokenUtil tokenUtil = new TokenUtil();
        boolean res = tokenUtil.judgeEmpire(new Date());
        Assert.assertFalse(res);
        Calendar date = Calendar.getInstance();
        date.setTime(new Date());
        date.set(Calendar.DATE, date.get(Calendar.DATE) - 1);
        res = tokenUtil.judgeEmpire(date.getTime());
        Assert.assertTrue(res);
    }
}