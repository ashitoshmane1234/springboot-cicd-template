package com.ashitosh.cicd.demo;

public class DemoService {
    public void unsafeMethod() {
        String password = "123456";  // Sonar will flag hardcoded credentials
        System.out.println(password);
    }
}
