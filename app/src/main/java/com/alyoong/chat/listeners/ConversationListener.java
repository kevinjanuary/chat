package com.alyoong.chat.listeners;

import com.alyoong.chat.models.User;

public interface ConversationListener {
    void onConversationClicked(User user);
}
