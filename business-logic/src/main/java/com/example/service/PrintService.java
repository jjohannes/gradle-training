package com.example.service;

import com.example.data.MessageModel;
import org.apache.commons.lang3.StringUtils;

public class PrintService {

    public String print(MessageModel model) {
        String formattedMessage = StringUtils.capitalize(model.getMessage());
        System.out.println(formattedMessage);
        return formattedMessage;
    }

}
