package com.demo;

import java.util.logging.Logger;

public class SomeClass {

    private Thread thread = new Thread();

    public void startThread() {
        Logger log = Logger.getLogger(getClass().getName());
        thread.start();
        log.info("Message " + Thread.currentThread().getName());
    }
}
