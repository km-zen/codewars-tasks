package sentenceSmash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SentenceSmashTest {

    @Test
    void smashWords() {
        // Given
        String [] words = {"Learning", "Java", "is", "cool"};
        // When
        Assertions.assertEquals("Learning Java is cool", SentenceSmash.smashWords(words));
        // Then

    }
}