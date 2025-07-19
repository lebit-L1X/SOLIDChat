package com.solidchat.model.user;

import java.util.UUID;

public abstract class User {
    private final String username;
    private final String password;
    private final String displayName;
    private final UUID userId;

    public User(String username, String password, String displayName, UUID userId){
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