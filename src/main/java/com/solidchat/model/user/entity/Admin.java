package com.solidchat.model.user.entity;

import com.solidchat.model.chat.entity.GroupChat;
import com.solidchat.model.user.valueobject.Displayname;
import com.solidchat.model.user.valueobject.Password;
import com.solidchat.model.user.valueobject.Username;

import java.util.UUID;

public class Admin extends User implements IAdmin, IChatter {

    public Admin(Username username, Password password, Displayname displayName) {
        super(username, password, displayName, UUID.randomUUID());
    }


    @Override
    public GroupChat createThread() {
        return null;
    }

    @Override
    public void addMember(UUID threadId, UUID memberId) {

    }

    @Override
    public void kickMember(UUID threadId, UUID memberId) {

    }

    @Override
    public void muteMember(UUID threadId, UUID memberId) {

    }

    @Override
    public void unmuteMember(UUID threadId, UUID memberId) {

    }

    @Override
    public void addMesage() {

    }

    @Override
    public void unsendMessage() {

    }


    @Override
    public void addChat(Thread thread, com.solidchat.model.chat.entity.Message message) {

    }

    @Override
    public void unsendChat(Thread thread, com.solidchat.model.chat.entity.Message message) {

    }
}
