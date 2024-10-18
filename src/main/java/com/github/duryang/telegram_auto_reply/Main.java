package com.github.duryang.telegram_auto_reply;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Credentials credentials;
        try {
            credentials = ConfigLoader.loadCredentials("credentials.yaml");
        } catch (IOException e) {
            logger.error("Could not load the credentials.");
            return;
        }
    }
}