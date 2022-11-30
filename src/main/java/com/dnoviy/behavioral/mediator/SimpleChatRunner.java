package com.dnoviy.behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat simpleTextChat = new SimpleTextChat();

        Admin admin = new Admin(simpleTextChat, "Admin");
        User user1 = new SimpleUser(simpleTextChat, "user 1");
        User user2 = new SimpleUser(simpleTextChat, "user 2");

        simpleTextChat.setAdmin(admin);
        simpleTextChat.addUserToChat(user1);
        simpleTextChat.addUserToChat(user2);

        admin.sendMessage("Ya admin");
        user1.sendMessage("Ya user 111111");
    }
}
