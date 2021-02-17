package com.mycompany.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
@ConfigurationProperties("images")
public class ImageProperties {

    private String path = "./data/images";

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
