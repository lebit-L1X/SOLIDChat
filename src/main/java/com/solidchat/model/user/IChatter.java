package com.solidchat.model.user;

import com.solidchat.model.chat.Message;

public interface IChatter {
    public void addChat(Thread thread, Message message);
    public void unsendChat(Thread thread, Message message);
}
