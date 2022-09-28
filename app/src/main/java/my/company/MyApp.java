package my.company;

import javax.annotation.Nullable;

public class MyApp {

    @Nullable
    public static void main(String[] args) {
        new PrintService().print(new MessageModel("Hi :)"));
    }
}
