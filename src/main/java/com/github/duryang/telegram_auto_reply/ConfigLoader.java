package com.github.duryang.telegram_auto_reply;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;

public class ConfigLoader {

    public static Credentials loadCredentials(String yamlFilePath) throws IOException {
        var yaml = new Yaml();

        try (InputStream inputStream = ConfigLoader.class.getClassLoader().getResourceAsStream(yamlFilePath)) {
            return yaml.loadAs(inputStream, Credentials.class);
        }
    }
}
