package com.solidchat.model.user;

import com.solidchat.model.chat.GroupChat;
import com.solidchat.model.chat.Message;

import java.util.UUID;

public class Admin extends User implements IAdmin, IChatter {

    public Admin(String username, String password, String displayName) {
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
    public void addChat(Thread thread, com.solidchat.model.chat.Message message) {

    }

    @Override
    public void unsendChat(Thread thread, com.solidchat.model.chat.Message message) {

    }
}
