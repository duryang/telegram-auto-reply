package com.github.duryang.telegram_auto_reply;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ConfigLoaderTest {

    @Test
    public void testLoadCredentials() throws IOException {
        Credentials credentials = ConfigLoader.loadCredentials("test-credentials.yaml");

        assertEquals("224455", credentials.getApiId());
        assertEquals("hasherino", credentials.getApiHash());
        assertEquals("12345", credentials.getPhoneNumber());
    }
}