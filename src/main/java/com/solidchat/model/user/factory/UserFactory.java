package com.solidchat.model.user.factory;

import com.solidchat.model.user.entity.User;
import com.solidchat.model.user.valueobject.Displayname;
import com.solidchat.model.user.valueobject.Password;
import com.solidchat.model.user.valueobject.Username;

public abstract class UserFactory {
    public abstract User createUser(Username username, Password password, Displayname displayName);
}
