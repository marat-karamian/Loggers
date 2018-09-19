package com.demo;

import sun.net.www.protocol.http.logging.HttpLogFormatter;

import java.io.IOException;
import java.util.logging.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Text");

        Logger log = Logger.getAnonymousLogger();

        try {
            FileHandler handler = new FileHandler("julLog.html");
            handler.setFormatter(new HttpLogFormatter());
            log.addHandler(handler);
        } catch (IOException e) {
            e.printStackTrace();
        }

        log.info("Info has started");
        log.warning("Warning has started");

        Handler logHandler = new ConsoleHandler();
        logHandler.setLevel(Level.FINEST);
        log.setLevel(Level.FINE);
        log.addHandler(logHandler);

        log.fine("Fine has started");


    }

}
