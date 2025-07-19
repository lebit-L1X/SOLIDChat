package com.solidchat.model.chat.factory;
import com.solidchat.model.chat.entity.Chat;
import com.solidchat.model.chat.entity.PrivateChat;
public class PrivateChatFactory extends ChatFactory{
    @Override
    public Chat createChat() {
        return new PrivateChat();
    }
}
