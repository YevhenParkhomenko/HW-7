package com.yevhen_parkhomenko.main;

public class Main {
    public static void main(String[] args) {
        Email e1 = new Email();
        e1.setFrom("Me");
        e1.setTo("Vasya");
        e1.setTheme("Who are you");

        Email e2 = new Email();
        e2.setFrom("Vasya");
        e2.setTo("Me");
        e2.setTheme("vacuum cleaners!");

        Email e3 = new Email();
        e3.setFrom("Kolya");
        e3.setTo("Vasya");
        e3.setTheme("No! Thanks!");

        Email e4 = new Email();
        e4.setFrom("Vasya");
        e4.setTo("Me");
        e4.setTheme("washing machines!");

        Email e5 = new Email();
        e5.setFrom("Me");
        e5.setTo("Vasya");
        e5.setTheme("Yes");

        Email e6 = new Email();
        e6.setFrom("Vasya");
        e6.setTo("Petya");
        e6.setTheme("+2");

        EmailSender es = new EmailSender();
        ILog log = new Log();
        es.send(e1, log);
        es.send(e2, log);
        es.send(e3, log);
        es.send(e4, log);
        es.send(e5, log);
        es.send(e6, log);
    }
}
