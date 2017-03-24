package com.pgs.workshop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Luke on 2017-03-24.
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){
        System.out.println("Hello world!");

        LOGGER.error("Error");
        LOGGER.warn("Warn");
        LOGGER.info("Info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
    }
}
