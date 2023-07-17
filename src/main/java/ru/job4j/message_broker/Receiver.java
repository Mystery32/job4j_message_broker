package ru.job4j.message_broker;

public interface Receiver {
    String name();

    void receive(String text);
}
