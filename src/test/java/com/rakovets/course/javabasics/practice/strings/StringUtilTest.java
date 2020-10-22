package com.rakovets.course.javabasics.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    private static StringUtil stringUtil; //создали поле

    @BeforeAll
    static void init() {
        stringUtil = new StringUtil(); //создаем объект
    }

    @Test
    void getUpperCaseTest() { // тренировочный тест
        //stringUtil.getUpperCase("qwerty"); //у этого объекта мы вызываем метод getUpperCase и передать туда значение " "
        Assertions.assertEquals("QWERTY", stringUtil.getUpperCase("qwerty")); // мы ожидаем, что этот код вернет вот такой результат
        Assertions.assertEquals("QWERTY", stringUtil.getUpperCase("QweRty"));
        Assertions.assertEquals("QW123ERTY", stringUtil.getUpperCase("qw123erty"));
        Assertions.assertEquals("QW+ERTY", stringUtil.getUpperCase("qw+erty"));
    }

    @Test
    void getConcatTest() { // 1
        Assertions.assertEquals("hello Dmitry", stringUtil.getConcat("hello", "Dmitry"));
        Assertions.assertEquals("Dont worry", stringUtil.getConcat("Dont", "worry"));
        Assertions.assertEquals("Be happy", stringUtil.getConcat("Be", "happy"));
    }

//    @Test
//    void getStringIndexTest() { // 2
//        Assertions.assertEquals(..., stringUtil.getStringIndex(...));
//        Assertions.assertEquals(..., stringUtil.getStringIndex(...));
//    }

    @Test
    void getEqualsTest() { // 3
        Assertions.assertEquals(true, stringUtil.getEquals("Hello", "Hello"));
        Assertions.assertEquals(false, stringUtil.getEquals("Hello", "Olleh"));
        Assertions.assertEquals(true, stringUtil.getEquals("12345", "12345"));
        Assertions.assertEquals(false, stringUtil.getEquals("54321", "12345"));
    }

    @Test
    void getUpperCaseandTrimTest() { // 4
        Assertions.assertEquals("NIHAU", stringUtil.getUpperCaseandTrim(" nihau "));
        Assertions.assertEquals("EVENT LOG", stringUtil.getUpperCaseandTrim(" eVEnt log "));
    }

    @Test
    void getStringSubstringTest() { // 5
        Assertions.assertEquals("дет стройка, работает", stringUtil.getStringSubstring("за окном идет стройка, работает"));
        Assertions.assertEquals("222222222222", stringUtil.getStringSubstring("2222222222222222222222"));
        Assertions.assertEquals("<10", stringUtil.getStringSubstring("123456789"));
    }

    @Test
    void getReplaceTest() { // 6
        Assertions.assertEquals("Joy Division is :) :) :)", stringUtil.getReplace("Joy Division is :( :( :("));
        Assertions.assertEquals(":) 1 :) 2 :)", stringUtil.getReplace(":( 1 :( 2 :("));
    }

    @Test
    void getStringCompareTest() { // 7
        Assertions.assertEquals(false, stringUtil.getStringCompare("do you like party", "do"));
        Assertions.assertEquals(true, stringUtil.getStringCompare("do you like party to do", "do"));
        Assertions.assertEquals(false, stringUtil.getStringCompare("123 is 321", "123"));
        Assertions.assertEquals(true, stringUtil.getStringCompare("123 is 123", "123"));
    }

    @Test
    void getStringNumbersOfVowelsTest() { // 8
        Assertions.assertEquals(8, stringUtil.getStringNumbersOfVowels("There are one vowels"));
    }


    @Test
    void getStringNumbersOfSymbolsTest() { // 9
        Assertions.assertEquals(4,stringUtil.getStringNumbersOfSymbols("there are ,,,, sign"));
        Assertions.assertEquals(3,stringUtil.getStringNumbersOfSymbols("there are ... sign"));
        Assertions.assertEquals(3,stringUtil.getStringNumbersOfSymbols("there are !!! sign"));
    }

    @Test
    void getStringReverseTest() { // 10
       Assertions.assertEquals("главрыба",stringUtil.getStringReverse("абырвалг"));
        Assertions.assertEquals("54321",stringUtil.getStringReverse("12345"));
    }

    @Test
    void getStringArraysNumbersTest() { // 11
        Assertions.assertEquals(new String[]{"1234", "5678", "90"}, stringUtil.getStringArraysNumbers("1234567890", 4));
    }

    @Test
    void getStringNubersWordsTest() { // 12
        Assertions.assertEquals(4, stringUtil.getStringNumbersOfWords("здесь будет четыре слова"));
        Assertions.assertEquals(6, stringUtil.getStringNumbersOfWords(" а вот здесь уже 6 слов "));
    }

    @Test
    void getAbriviatureTest() { // 13
        Assertions.assertArrayEquals(new String[]{"S.","D.","N"}, stringUtil.getAbbreviation("Sedun Dmitry Nikolaevich"));
    }

    @Test
    void getStringNumbersTest() { // 14
        Assertions.assertEquals("3574325666", stringUtil.getStringNumbers("stri3n5g7 4w3i2t5h n6u6m6bers"));
        Assertions.assertEquals("12345", stringUtil.getStringNumbers("1 and 2 and3 and 4and5"));

    }
}
