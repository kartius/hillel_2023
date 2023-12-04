package edu.hillel.lesson32;

import org.apache.log4j.Logger;

public class Main {

    final static Logger LOGGER = Logger.getLogger(Main.class);


    public static void main(String[] args) {
        try {
            LOGGER.info("test info");
            LOGGER.debug("test debug");

            throw new Exception("bbb");

        } catch (Exception e) {
            LOGGER.error("test error", e);
        }
    }
}
