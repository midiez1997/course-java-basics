package com.rakovets.course.javabasics.practice.jcf.map;

import com.rakovets.course.javabasics.map.TextMonitoring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextMonitoringTest {

    @Test
    public void researchTextTest() {
        String text = "one two three three four four four five five";
        String emptyText = "";
        Assertions.assertEquals(5, TextMonitoring.researchText(text).size());
        Assertions.assertEquals(0, TextMonitoring.researchText(emptyText).size());
    }

    @Test
    public void getCountUniqueWordsTest() {
        String text = "one two three three four four four five five six";
        Assertions.assertEquals(3, TextMonitoring.getCountUniqueWords(text));
    }

    @Test
    public void getUniqueWordsTest() {
        String text = "one two three three four four four five five six";
        Assertions.assertEquals(3, TextMonitoring.getUniqueWords(text).size());
    }

    @Test
    public void getFrequencyUsingWordTest() {
        String text = "one two three three four four four five five six word word";
        Assertions.assertEquals(2, TextMonitoring.getFrequencyUsingWord(text));
    }

    @Test
    public void getWordFrequencyDescTest() {
        String text = "one two two three three four four four five five six six six word word";
        Assertions.assertEquals(7, TextMonitoring.getWordFrequencyDesc(text, true).size());
    }

}