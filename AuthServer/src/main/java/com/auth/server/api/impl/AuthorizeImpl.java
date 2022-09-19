package com.auth.server.api.impl;


import com.auth.server.api.inf.Authorize;
import com.auth.server.model.Role;
import com.auth.server.model.Token;
import com.auth.server.model.User;
import com.auth.server.utils.SecureUtil;
import com.auth.server.utils.TokenUtil;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import javax.jws.WebService;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


/**
 *   authorize service
 */
@WebService
public class AuthorizeImpl implements Authorize {
    public static final Logger logger = LoggerFactory.getLogger(AuthorizeImpl.class);
    /**
     *  store user
     */
    public  HashMap<String, User> usersMap = new HashMap<>();

    /**
     *  store role
     */
    public HashMap<String, Role> rolesMap = new HashMap<>();



    /**
     *  store the relationShip between token and User，
     *  make it possible for several user login.
     */
    public HashMap<String, User> tokenUserMap = new HashMap<>();

    /**
     *  store token with created time.
     */
    public  HashMap<String, Token> tokenMap = new HashMap<>();


    /**
     * create user
     *
     * @param username
     * @param password
     * @return string
     */
    public String createUser(String username, String password){
        if (usersMap.containsKey(username)){
            logger.error("user exists.");
            return "create user failed!";
        }
        try {
            usersMap.put(username, new User(username, SecureUtil.encrypt(password)));
        }catch (Exception e){
            logger.error("there is error.");
            return "create user failed!";
        }

        return "create user success!";
    }

    /**
     * delete user
     *
     * @param username
     * @return string
     */
    public String deleteUser(String username){
        if (!usersMap.containsKey(username)){
            logger.error("user doesn't exist.");
            return "delete user failed!";
        }
        usersMap.remove(username);
        return "delete user success!";
    }

    /**
     * create user
     *
     * @param roleName
     * @return String
     */
    public String createRole(String roleName){
        if (rolesMap.containsKey(roleName)){
            logger.error("role exists.");
            return "create role failed!";
        }
        rolesMap.put(roleName, new Role(roleName));
        return "create role success!";
    }

    /**
     * delete role
     *
     * @param roleName
     * @return String
     */
    public String deleteRole(String roleName){
        if (!rolesMap.containsKey(roleName)){
            logger.error("role doesn't exist.");
            return "delete role failed!";
        }
        rolesMap.remove(roleName);
        return "delete role success!";
    }

    /**
     * add user to role
     *
     * @param username
     * @param roleName
     * @return String
     */
    public String addRoleToUser(String roleName, String username) {
        if (!usersMap.containsKey(username) || !rolesMap.containsKey(roleName) ){
            logger.error("user or role doesn't exist.");
            return "error";
        }
        User user = usersMap.get(username);
        List roles = user.getRoles();
        if (roles!=null && roles.contains(roleName)){
            logger.warn("role exist.");
        } else {
            roles.add(roleName);
            user.setRoles(roles);
        }
        return "add role to user success!";
    }

    /**
     * authenticate
     *
     * @param username
     * @param password
     * @return String
     */
    public String authenticate(String username, String password) {
        Token tmpToken = new Token();
        if ( !usersMap.containsKey(username)){
            logger.error("user doesn't  exist.");
            return "error";
        }
        User user = usersMap.get(username);
        String theUserPaas = user.getPassword();
        if( !theUserPaas.equals(SecureUtil.encrypt(password))){
            logger.error("user doesn't  exist.");
            return "error";
        }
        tmpToken.setToken(""+TokenUtil.generate());
        tmpToken.setGenerateDate(new Date());
        Long secret = TokenUtil.generate();
        tokenUserMap.put(""+secret, user);
        tokenMap.put(""+secret, tmpToken);
        return ""+secret;
    }

    /**
     * inValidate
     *
     * @param tokenStr
     */
    public void inValidate(String tokenStr){
        if (tokenStr!=null && tokenUserMap.containsKey(tokenStr)){
            // make token inValidate
            tokenMap.remove(tokenStr);
            tokenUserMap.remove(tokenStr);
        }
    }

    /**
     * check role
     *
     * @param tokenStr
     * @param roleName
     * @return boolean
     * @throws Exception
     */
    public String checkRole(String tokenStr, String roleName){
        if(tokenMap.containsKey(tokenStr)){
            Token tmpToken = tokenMap.get(tokenStr);
            Date createTime = tmpToken.getGenerateDate();
            // judge empire
            if (TokenUtil.judgeEmpire(createTime)){
                // make token inValidate
                tokenMap.remove(tokenStr);
                tokenUserMap.remove(tokenStr);
                return "error";
            }
            User tmpUser = tokenUserMap.get(tokenStr);
            List roles = tmpUser.getRoles();
            if(roles.contains(roleName)){
                return "true";
            }else {
                return "false";
            }
        }
        return "error";
    }


    /**
     * query all roles
     *
     * @param tokenStr
     * @return List<Role>
     * @throws Exception
     */
    public String allRoles(String tokenStr) {
        if(tokenMap.containsKey(tokenStr)){
            Token tmpToken = tokenMap.get(tokenStr);
            Date createTime = tmpToken.getGenerateDate();
            // judge empire
            if (TokenUtil.judgeEmpire(createTime)){
                // make token inValidate
                tokenMap.remove(tokenStr);
                tokenUserMap.remove(tokenStr);
                return "error";
            }
            User tmpUser = tokenUserMap.get(tokenStr);
            List roles = tmpUser.getRoles();
            return roles.toString();
        }
        // if there is no token,it is invalidated.
        return "error";
    }

}
