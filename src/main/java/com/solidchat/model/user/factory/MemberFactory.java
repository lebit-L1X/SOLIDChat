package com.solidchat.model.user.factory;

import com.solidchat.model.user.Member;
import com.solidchat.model.user.User;

public class MemberFactory extends UserFactory{
    @Override
    public User createUser() {
        return new Member();
    }
}
