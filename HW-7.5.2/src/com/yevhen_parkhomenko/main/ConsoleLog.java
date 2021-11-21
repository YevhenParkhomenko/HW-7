package com.yevhen_parkhomenko.main;

public class ConsoleLog implements ILog {
    @Override
    public void print(Email email) {
        System.out.println("Email from '" + email.from + "' to '" + email.to + "' was send");
    }
}
