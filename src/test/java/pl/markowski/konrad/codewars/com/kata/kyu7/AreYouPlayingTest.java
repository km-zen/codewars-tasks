package pl.markowski.konrad.codewars.com.kata.kyu7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AreYouPlayingTest {

    @Test
    void validate() {
        // wersja moja
        Assertions.assertEquals("Konrad does not play banjo", AreYouPlaying.validate("Konrad"));
        Assertions.assertEquals("Robert plays banjo", AreYouPlaying.validate("Robert"));

        // wersja z codewars
        Assertions.assertEquals("Konrad does not play banjo", AreYouPlaying.validate2("Konrad"));
        Assertions.assertEquals("Robert plays banjo", AreYouPlaying.validate2("Robert"));
    }
}