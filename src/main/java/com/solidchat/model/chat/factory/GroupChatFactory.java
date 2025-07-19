package com.solidchat.model.chat.factory;


import com.solidchat.model.chat.entity.Chat;
import com.solidchat.model.chat.entity.GroupChat;

public class GroupChatFactory extends ChatFactory{

    @Override
    public Chat createChat() {
        return new GroupChat();
    }
}
