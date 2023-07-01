package com.solid.dip.solution;

import java.util.List;

public class MainMessage {
    List<IMessageService> messageServices;

    public MainMessage(List<IMessageService> messageServices) {
        this.messageServices = messageServices;
    }

    void sendMessage() {
        messageServices.forEach(IMessageService::send);
    }
}
