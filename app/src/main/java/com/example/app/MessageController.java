package com.example.app;

import com.example.data.MessageModel;
import com.example.service.PrintService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/")
    public String index() {
        return new PrintService().print(new MessageModel("hi !!!! :)"));
    }

}
