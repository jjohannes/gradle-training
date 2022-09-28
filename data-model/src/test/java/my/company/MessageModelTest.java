package my.company;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageModelTest {

    @Test
    @Tag("slow")
    void testMessage() {
        assertEquals("hi", new MessageModel("hi").getMessage());
    }
}
