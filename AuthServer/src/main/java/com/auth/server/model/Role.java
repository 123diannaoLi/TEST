package com.auth.server.model;

/**
 * role model
 */
public class Role {

    public Role(String name) {
        this.name = name;
    }

    /**
     * role name
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
