package com.rakovets.course.javabasics.practice.jcf.collection;

import com.rakovets.course.javabasics.collection.StringCollectionUtil;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class StringCollectionUtilTest {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("this");
        collection.add("is");
        collection.add("lots");
        collection.add("of");
        collection.add("fun");
        collection.add("for");
        collection.add("every");
        collection.add("Java");
        collection.add("programmer");
        String[] strings = StringCollectionUtil.resetWordsByLength(collection, 4);
        System.out.println(Arrays.toString(strings));
        Assertions.assertEquals("*", strings[0]);
        Assertions.assertEquals("is", strings[1]);
        Assertions.assertEquals("*", strings[2]);
        Assertions.assertEquals("of", strings[3]);
        Assertions.assertEquals("fun", strings[4]);
        Assertions.assertEquals("for", strings[5]);
        Assertions.assertEquals("every", strings[6]);
        Assertions.assertEquals("*", strings[7]);
        Assertions.assertEquals("programmer", strings[8]);
    }
}

