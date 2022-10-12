package pl.markowski.konrad.codewars.com.kata.ku7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.markowski.konrad.codewars.com.kata.ku7.SentenceSmash;

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