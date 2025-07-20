package com.solidchat.model.chat.factory;
import com.solidchat.model.chat.entity.Chat;
import com.solidchat.model.chat.entity.PrivateChat;

import java.util.UUID;

public class PrivateChatFactory extends ChatFactory{
    @Override
    public Chat createChat(UUID chatId) {
        return new PrivateChat(chatId);
    }
}
