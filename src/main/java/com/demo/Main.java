package com.demo;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        System.out.println("Text");
        Logger log = Logger.getLogger(Main.class.getName());
        Thread thread = new Thread();
        thread.start();
        log.info("Info has started from thread " + Thread.currentThread().getName());
        log.warning("Warning has started from thread " + Thread.currentThread().getName());

        Handler logHandler = new ConsoleHandler();
        logHandler.setLevel(Level.FINE);
        log.setLevel(Level.FINEST);
        log.addHandler(logHandler);

        log.fine("Fine has started from thread " + Thread.currentThread().getName());

    }

}
