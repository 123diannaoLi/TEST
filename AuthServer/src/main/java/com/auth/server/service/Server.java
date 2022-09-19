package com.auth.server.service;

import com.auth.server.api.impl.AuthorizeImpl;

import javax.xml.ws.Endpoint;

/**
 * start service
 */
public class Server {
    static String address = "http://127.0.0.1:8090/Authorize";

    public static void main(String[] args) {
        System.out.println("web service start");
        AuthorizeImpl implementor = new AuthorizeImpl();
        //jdk expose webservice api
        Endpoint.publish(address, implementor);
        System.out.println("web service started");
    }
}
