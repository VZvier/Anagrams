package ua.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PhraseReversTest {

    String actualValue;
    String expectedResult;

    @Test
    void testForANull() {
        actualValue = PhraseReverse.phraseReverse(null);
        expectedResult = "";
        assertEquals(expectedResult, actualValue);
    }

    @Test
    void testEmptyString() {
        actualValue = PhraseReverse.phraseReverse("");
        expectedResult = "";
        assertEquals(expectedResult, actualValue);
    }

    @Test
    void testASpace() {
        actualValue = PhraseReverse.phraseReverse(" ");
        expectedResult = "";
        assertEquals(expectedResult, actualValue);
    }

    @Test
    void testAFewSpaces() {
        actualValue = PhraseReverse.phraseReverse("   ");
        expectedResult = "";
        assertEquals(expectedResult, actualValue);
    }

    @Test
    void testInputOneCHaracter() {
        actualValue = PhraseReverse.phraseReverse("H");
        expectedResult = "H";
        assertEquals(expectedResult, actualValue);
    }

    @Test
    void testMultipleSameLetterInput() {
        actualValue = PhraseReverse.phraseReverse("hhhhhh");
        expectedResult = "hhhhhh";
        assertEquals(expectedResult, actualValue);
    }

    @Test
    void testInputSameLetterInDiffCases() {
        actualValue = PhraseReverse.phraseReverse("HHhHhhH");
        expectedResult = "HhhHhHH";
        assertEquals(expectedResult, actualValue);
    }

    @Test
    void testInvertingOneWord() {
        actualValue = PhraseReverse.phraseReverse("Helicopter");
        expectedResult = "retpocileH";
        assertEquals(expectedResult, actualValue);
    }

    @Test
    void testInputJustSymbols() {
        actualValue = PhraseReverse.phraseReverse("!@1#$%@");
        expectedResult = "!@1#$%@";
        assertEquals(expectedResult, actualValue);
    }

    @Test
    void testInvertingSeveralWords() {
        actualValue = PhraseReverse.phraseReverse("Hello Butty World");
        expectedResult = "olleH yttuB dlroW";
        assertEquals(expectedResult, actualValue);
    }

    @Test
    void testInvertingSeveralWordsWithSymbols() {
        actualValue = PhraseReverse.phraseReverse("Hello! Butty! World!");
        expectedResult = "olleH! yttuB! dlroW!";
        assertEquals(expectedResult, actualValue);
    }

}
