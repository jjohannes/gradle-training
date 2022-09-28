package my.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageIntegrationTest {

    @Test
    void testMessage() {
        assertEquals("hi", new MessageModel("hi").getMessage());
    }
}
