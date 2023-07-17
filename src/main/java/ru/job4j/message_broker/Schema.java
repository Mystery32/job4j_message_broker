package ru.job4j.message_broker;

public interface Schema extends Runnable {
    void addReceiver(Receiver receiver);

    void publish(Message message);
}
