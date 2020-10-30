package com.rakovets.course.javabasics.practice.jcf.map;

import org.junit.jupiter.api.Test;

public static void main(String[] args){
@Test
public void test(){
        String text="good good good best worse house house word word word word";

        Assertion.assertEquals(5,TextMonitoring.researchText(text).size());

        Assertion.assertEquals(2,TextMonitoring.getCountUniqueWords(text));

        Assertion.assertEquals(2,TextMonitoring.getUniqueWords(text).size());

        Map<String, Integer> mapForTest=new HashMap<>();
        mapForTest.put("word",4);
        mapForTest.put("good",3);
        mapForTest.put("house",2);
        mapForTest.put("best",1);
        mapForTest.put("worse",1);
        //....
        Assertion.assertTrue(mapForTest.equals(TextMonitoring.getUniqueWords(text).size()));
        }

@Test
public void test(){
        String text="good good good best worse house house word word word word";

        Assertion.assertEquals(5,TextMonitoring.researchText(text).size());

        Assertion.assertEquals(2,TextMonitoring.getCountUniqueWords(text));

        Assertion.assertEquals(2,TextMonitoring.getUniqueWords(text).size());

        Map<String, Integer> mapForTest=new HashMap<>();
        mapForTest.put("word",4);
        mapForTest.put("good",3);
        mapForTest.put("house",2);
        mapForTest.put("best",1);
        mapForTest.put("worse",1);
        Assertion.assertTrue(mapForTest.equals(TextMonitoring.getUniqueWords(text).size()));
        }
        }
