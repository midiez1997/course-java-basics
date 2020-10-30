package com.rakovets.course.javabasics.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StringCollectionUtil {

    public static String[] resetWordsByLength(Collection<String> collection, int lengthWord) {
     String[] strings = collection.toArray(new String[collection.size()]); // сделали массив стрингов
     for (int i = 0; i < strings.length; i++) { //проходим по каждому элементу
         if (strings[i].length() == lengthWord) { // сравниваем длину строки(strings[i].length()) с длиной аргумента(lengthword)
             strings[i] = "*";
         }
     }
     return strings;
    }

    public static String[] removeWordsByLength(Collection<String> collection, int lengthWord) {
        String[] strings = collection.toArray(new String[collection.size()]); // сделали массив стрингов
        for (int i = 0; i < strings.length; i++) { //проходим по каждому элементу
            if (strings[i].length() == lengthWord) { // сравниваем длину строки(strings[i].length()) с длиной аргумента(lengthword)
                List<String> list = new ArrayList<String>(Arrays.asList(strings));
                list.remove(strings[i]);
                strings = list.toArray(new String[0]);
            }
        }
        return strings;
    }



}
