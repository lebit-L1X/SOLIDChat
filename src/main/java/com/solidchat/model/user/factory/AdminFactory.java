package com.solidchat.model.user.factory;

import com.solidchat.model.user.entity.Admin;
import com.solidchat.model.user.entity.User;

public class AdminFactory extends UserFactory{

    @Override
    public User createUser(String username, String password, String displayName) {
        return new Admin(username, password, displayName);
    }
}
