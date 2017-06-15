package com.janita.upload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by Janita on 2017/6/15 0015-下午 3:47
 * 该类是：
 */
@SpringBootApplication
public class UploadApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(UploadApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(UploadApplication.class);
    }
}