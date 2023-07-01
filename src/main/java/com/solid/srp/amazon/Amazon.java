package com.solid.srp.amazon;

import java.util.Map;

public class Amazon {
    public void createUser(Map<String, Object> userInfo) {
        // TODO: Create new amazon user
    }

    public void changePassword(int userId, String password) {
        // TODO: User can change the password
    }

    public void orderPlaced(Map<String, Object> products) {
        // TODO: order can be purchased
    }

    public void cancelOrder(int orderId) {
        // TODO: order can be purchased
    }

    public void sendNotification(String mode) {
        if(mode == "email") {
            // TODO: Send notification via email
        } else if(mode == "whatsapp") {
            // TODO: Send notification via whatsapp
        }
    }
}