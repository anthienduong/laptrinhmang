package com.muc;

import java.util.ArrayList;
import java.util.List;

public class MemoryUser {
    private List<User> userList;
    private  static MemoryUser instance;
    private MemoryUser (){
        userList = new ArrayList<>();
    }

    public static MemoryUser getInstance() {
        if (instance == null){
            instance = new MemoryUser();
        }

            return instance;
    }

    public List<User> getUserList() {
        return userList;
    }
}
