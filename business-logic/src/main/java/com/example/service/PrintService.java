package com.example.service;

import com.example.data.MessageModel;
import org.apache.commons.lang3.StringUtils;

public class PrintService {

    public void print(MessageModel model) {
        StringUtils.capitalize("abc");
        System.out.println(model.getMessage());
    }

}
