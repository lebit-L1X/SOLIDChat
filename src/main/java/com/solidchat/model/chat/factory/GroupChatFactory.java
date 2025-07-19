package com.solidchat.model.chat.factory;


import com.solidchat.model.chat.Chat;
import com.solidchat.model.chat.GroupChat;

public class GroupChatFactory extends ChatFactory{

    @Override
    public Chat createChat() {
        return new GroupChat();
    }
}
