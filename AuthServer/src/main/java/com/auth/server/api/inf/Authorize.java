package com.auth.server.api.inf;

import javax.jws.WebService;

/**
 *   authorize interface
 */
@WebService
public interface Authorize {

    /**
     * create user
     *
     * @param username
     * @param password
     * @return string
     */
    public String createUser(String username, String password);


    /**
     * delete user
     *
     * @param username
     * @return string
     */
    public String deleteUser(String username);

    /**
     * create user
     *
     * @param roleName
     * @return String
     */
    public String createRole(String roleName);

    /**
     * delete role
     *
     * @param roleName
     * @return String
     */
    public String deleteRole(String roleName);


    /**
     * add user to role
     *
     * @param username
     * @param roleName
     * @return String
     */
    public String addRoleToUser(String roleName, String username);



}
