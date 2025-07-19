package com.solidchat.model.chat.factory;

import com.solidchat.model.chat.entity.Chat;

import java.util.UUID;

public abstract class ChatFactory {
    public abstract Chat createChat(UUID chatId);
}
