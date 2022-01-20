package org.example.app;

import org.apache.commons.lang3.StringUtils;
import org.example.services.MyService;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Hello");
        StringUtils.abbreviate("", 2);
        new MyService();
    }
}
