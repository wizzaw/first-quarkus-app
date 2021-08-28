package com.nayki.quarkus;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingConfig {

    public String recipient = "World!";

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
}
