package com.solidchat.model.user;

import com.solidchat.model.chat.GroupChat;

import java.sql.Time;
import java.util.UUID;

public interface IAdmin {
    GroupChat createThread();
    void addMember(UUID threadId , UUID memberId);
    void kickMember(UUID threadId, UUID memberId);
    void muteMember (UUID threadId, UUID memberId);
    void unmuteMember(UUID threadId, UUID memberId);
    void addMesage();
    void unsendMessage();

    class Message {
        private UUID messageId;
        private String content;
        private UUID poster;
        private Time postedTime;
    }


}