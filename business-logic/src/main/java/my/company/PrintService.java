package my.company;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;

public class PrintService {

    public void print(MessageModel m) {
        System.out.println(m.getMessage());
        StringUtils.capitalize("abc");
        LoggerFactory.getLogger(MessageModel.class).info("Hey");
    }
}
