package com.solidchat.model.chat.entity;

import java.util.UUID;


public abstract class Chat {
    private final UUID chatId;

    protected Chat(UUID chatId) {
        this.chatId = chatId;
    }
//    private final ArrayList<Message> messageList;
//    private final ArrayList<User> userList;
}
