package com.solidchat.model.chat.factory;

import com.solidchat.model.chat.BillboardChat;
import com.solidchat.model.chat.Chat;

public class GroupChatFactory extends ChatFactory{

    @Override
    public Chat createChat() {
        return new BillboardChat();
    }
}
