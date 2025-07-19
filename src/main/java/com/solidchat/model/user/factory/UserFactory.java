package com.solidchat.model.user.factory;

import com.solidchat.model.user.entity.User;

public abstract class UserFactory {
    public abstract User createUser(String username, String password, String displayName);
}
