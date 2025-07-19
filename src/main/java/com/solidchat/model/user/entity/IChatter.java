package com.solidchat.model.user.entity;

import com.solidchat.model.chat.entity.Message;

public interface IChatter {
    public void addChat(Thread thread, Message message);
    public void unsendChat(Thread thread, Message message);
}
