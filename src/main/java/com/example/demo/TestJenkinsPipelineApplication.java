package com.example.demo;

import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestJenkinsPipelineApplication {

	public static void main(String[] args) {

        SpringApplication.run(TestJenkinsPipelineApplication.class, args);
        System.out.println("Hello from jenkins, i am running now!");
    }
}
