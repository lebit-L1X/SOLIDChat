package com.solidchat.model.chat.factory;

import com.solidchat.model.chat.entity.BillboardChat;
import com.solidchat.model.chat.entity.Chat;

import java.util.UUID;

public class BillboardChatFactory extends ChatFactory{

    @Override
    public Chat createChat(UUID chatId) {
        return new BillboardChat(chatId);
    }
}
