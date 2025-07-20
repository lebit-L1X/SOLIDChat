package com.solidchat.model.chat.factory;


import com.solidchat.model.chat.entity.Chat;
import com.solidchat.model.chat.entity.GroupChat;

import java.util.UUID;

public class GroupChatFactory extends ChatFactory{

    @Override
    public Chat createChat(UUID chatId) {
        return new GroupChat(chatId);
    }
}
