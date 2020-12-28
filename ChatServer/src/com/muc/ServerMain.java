package com.muc;


import java.util.List;

/**
 * Created by jim on 4/18/17.
 */
public class ServerMain {
    public static void main(String[] args) {
        MemoryUser memoryUser = MemoryUser.getInstance();
        memoryUser.getUserList().add(new User("An","123"));
        memoryUser.getUserList().add(new User("Ly","123"));
        memoryUser.getUserList().add(new User("Tam","123"));
        memoryUser.getUserList().add(new User("Hong","123"));
        memoryUser.getUserList().add(new User("Kieu","123"));
        int port = 8818;
        Server server = new Server(port);
        server.start();

    }
}
