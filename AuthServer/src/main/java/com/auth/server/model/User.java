package com.auth.server.model;

import java.util.ArrayList;
import java.util.List;

/**
 * user model
 */
public class User {
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    /**
     * username
     */
    private String name;

    /**
     * user password
     */
    private String password;

    /**
     * roles that have
     */
    private List<Role> roles = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
