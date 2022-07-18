package com.example.app;

import com.example.data.MessageModel;
import com.example.service.PrintService;

public class ExampleApplication {

    public static void main(String[] args) {
        new PrintService().print(new MessageModel("Hi :)"));
    }
}
