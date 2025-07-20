package com.solidchat.model.user.entity;

import com.solidchat.model.chat.entity.Message;
import com.solidchat.model.user.valueobject.Displayname;
import com.solidchat.model.user.valueobject.Password;
import com.solidchat.model.user.valueobject.Username;

import java.util.UUID;

public class Member extends User implements IChatter {

    private boolean muted;

    public Member(Username username, Password password, Displayname displayName) {
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
