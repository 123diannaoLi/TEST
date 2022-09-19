package com.auth.server;

import com.auth.server.api.impl.AuthorizeImpl;
import com.auth.server.api.inf.Authorize;

import javax.xml.ws.Endpoint;


public class Server {
    static String address = "http://127.0.0.1:8090/Authorize";

    public static void main(String[] args) {
        System.out.println("web service start");
        Authorize implementor = new AuthorizeImpl();
        Endpoint.publish(address, implementor);
        System.out.println("web service started");
    }

}