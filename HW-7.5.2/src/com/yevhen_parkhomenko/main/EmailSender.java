package com.yevhen_parkhomenko.main;

public class EmailSender {
    public void send(Email email, ILog log) {
        log.print(email);
    }
}