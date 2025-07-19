package com.solidchat.model.chat.factory;
import com.solidchat.model.chat.Chat;
import com.solidchat.model.chat.PrivateChat;
public class PrivateChatFactory extends ChatFactory{
    @Override
    public Chat createChat() {
        return new PrivateChat();
    }
}
