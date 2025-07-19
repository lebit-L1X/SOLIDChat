package com.solidchat.model.chat.factory;

import com.solidchat.model.chat.BillboardChat;
import com.solidchat.model.chat.Chat;

import java.util.UUID;

public class BillboardChatFactory extends ChatFactory{

    @Override
    public Chat createChat(UUID chatId) {
        return new BillboardChat(chatId);
    }
}
