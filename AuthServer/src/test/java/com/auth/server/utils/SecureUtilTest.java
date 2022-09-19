package com.auth.server.utils;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;


public class SecureUtilTest extends TestCase {

    @Test
    public void testEncryptAndDecry() {
        String secureCode = SecureUtil.encrypt("password");
        Assert.assertEquals("password", SecureUtil.decrypt(secureCode));
    }

}