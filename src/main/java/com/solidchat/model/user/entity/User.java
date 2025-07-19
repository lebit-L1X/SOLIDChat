package com.solidchat.model.user.entity;

import com.solidchat.model.user.valueobject.Displayname;
import com.solidchat.model.user.valueobject.Password;
import com.solidchat.model.user.valueobject.Username;

import java.util.UUID;

public abstract class User {
    private final Username username;
    private final Password password;
    private final Displayname displayName;
    private final UUID userId;

    public User(Username username, Password password, Displayname displayName, UUID userId){
        this.username = username;
        this.password = password;
        this.displayName = displayName;
        this.userId = userId;
    }

    public boolean isValidCredentials(String inputUsername, String inputPassword){
        return (this.username.equals(inputUsername) && this.password.equals(inputPassword));
    }

    public String getDisplayName(){
        return this.displayName;
    }

}