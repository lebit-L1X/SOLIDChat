package com.solidchat.model.user.entity;

import com.solidchat.model.chat.entity.Message;

import java.util.UUID;

public class Member extends User implements IChatter {

    private boolean muted;

    public Member(String username, String password, String displayName) {
        super(username, password, displayName, UUID.randomUUID()  );
    }

    @Override
    public void addChat(Thread thread, Message message) {

    }

    @Override
    public void unsendChat(Thread thread, Message message) {

    }

    public boolean isMuted(){
        return muted;
    }
}
