package com.auth.server.api.impl;

import com.auth.server.model.Role;
import com.auth.server.model.Token;
import com.auth.server.model.User;
import com.auth.server.utils.SecureUtil;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * test class
 */
public class AuthorizeImplTest extends TestCase {


    @Test
    public void testCreateUser() {
        AuthorizeImpl testAuth = new AuthorizeImpl();
        testAuth.createUser("userDemoOne", "hello");
        HashMap<String, User> usersMap = testAuth.usersMap;
        Assert.assertEquals("hello", SecureUtil.decrypt(usersMap.get("userDemoOne").getPassword()));
        String resStr = testAuth.createUser("userDemoOne", "hello");
        Assert.assertEquals("create user failed!", resStr);
    }

    @Test
    public void testDeleteUser() {
        AuthorizeImpl testAuth = new AuthorizeImpl();
        String resStr = testAuth.deleteUser("demoOne");
        Assert.assertEquals("delete user failed!", resStr);
        testAuth.createUser("demoOne", "hello");
        resStr = testAuth.deleteUser("demoOne");
        Assert.assertEquals("delete user success!", resStr);
    }

    @Test
    public void testCreateRole() {
        AuthorizeImpl testAuth = new AuthorizeImpl();
        testAuth.createRole("roleDemoOne");
        HashMap<String, Role> rolesMap = testAuth.rolesMap;
        Assert.assertEquals("roleDemoOne", rolesMap.get("roleDemoOne").getName());
        String resStr = testAuth.createRole("roleDemoOne");
        Assert.assertEquals("create role failed!", resStr);
    }

    @Test
    public void testDeleteRole() {
        AuthorizeImpl testAuth = new AuthorizeImpl();
        String resStr = testAuth.deleteRole("demoRole");
        Assert.assertEquals("delete role failed!", resStr);
        testAuth.createRole("demoRole");
        resStr = testAuth.deleteRole("demoRole");
        Assert.assertEquals("delete role success!", resStr);
    }

    @Test
    public void testAddRoleToUser() {
        AuthorizeImpl testAuth = new AuthorizeImpl();
        String resStr = "";
        try {
            resStr = testAuth.addRoleToUser("govern", "tom");
        } catch (Exception e) {
            Assert.assertNotNull(e);
        }
        testAuth.createUser("tom", "hello");
        testAuth.createRole("govern");
        try {
            resStr = testAuth.addRoleToUser("govern", "tom");
        } catch (Exception e) {
            Assert.assertNull(e);
        }
        Assert.assertEquals("add role to user success!", resStr);
    }

    @Test
    public void testAuthenticate() {
        AuthorizeImpl testAuth = new AuthorizeImpl();
        try {
            testAuth.authenticate("Linda", "paasWord");
        } catch (Exception e) {
            Assert.assertNotNull(e);
        }
        testAuth.createUser("Linda", "paasWord");
        try {
            String secret = testAuth.authenticate("Linda", "paasWord");
            Assert.assertNotNull(secret);
        } catch (Exception e) {
            Assert.assertNull(e);
        }
    }

    @Test
    public void testInValidate() {
        AuthorizeImpl testAuth = new AuthorizeImpl();
        testAuth.createUser("tom", "hello");
        try {
            String secret = testAuth.authenticate("tom", "hello");
            Assert.assertNotNull(secret);
            testAuth.inValidate(secret);
        } catch (Exception e) {
            Assert.assertNull(e);
        }
    }


    @Test
    public void testCheckRole() {
        AuthorizeImpl testAuth = new AuthorizeImpl();
        testAuth.createUser("tom", "hello");
        testAuth.createRole("govern");
        testAuth.createRole("student");
        testAuth.addRoleToUser("govern", "tom");
        String secret = testAuth.authenticate("tom", "hello");
        String checkRes = testAuth.checkRole(secret, "govern");
        Assert.assertEquals("true", checkRes);
        // test empire token
        Token token = testAuth.tokenMap.get(secret);
        //  before 24h time
        Calendar date = Calendar.getInstance();
        date.setTime(new Date());
        date.set(Calendar.DATE, date.get(Calendar.DATE) - 1);
        token.setGenerateDate(date.getTime());
        testAuth.tokenMap.put(secret, token);
        String res = testAuth.checkRole(secret, "govern");
        Assert.assertEquals("error", res);
    }

    @Test
    public void testAllRoles() throws Exception {
        AuthorizeImpl testAuth = new AuthorizeImpl();
        testAuth.createUser("tom", "hello");
        testAuth.createRole("govern");
        testAuth.createRole("lower");
        testAuth.addRoleToUser("govern", "tom");
        testAuth.addRoleToUser("lower", "tom");
        String secret = testAuth.authenticate("tom", "hello");
        String allRoles = testAuth.allRoles(secret);
        Assert.assertNotNull(allRoles);
        // test empire token
        Token token = testAuth.tokenMap.get(secret);
        //  before 24h time
        Calendar date = Calendar.getInstance();
        date.setTime(new Date());
        date.set(Calendar.DATE, date.get(Calendar.DATE) - 1);
        token.setGenerateDate(date.getTime());
        testAuth.tokenMap.put(secret, token);
        String res = testAuth.allRoles(secret);
        Assert.assertEquals("error", res);
        res =  testAuth.allRoles("12123123234");
        Assert.assertEquals("error", res);
    }
}