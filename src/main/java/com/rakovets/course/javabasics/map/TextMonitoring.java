package com.rakovets.course.javabasics.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

    public class TextMonitoring {

        public static Map<String, Integer> researchText(String text) {
            String[] strings = text.split(" ");
            Map<String, Integer> map = new HashMap<>();
            for (String string : strings) {
                if (map.containsKey(string)) {
                    map.put(string, map.get(string) + 1);
                } else {
                    map.put(string, 1);
                }
            }
            return map;
        }


        public static int getCountUniqueWords(String text) {
            Map<String, Integer> map = researchText(text);
            int counter = 0;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                Integer value = entry.getValue();
                if (value == 1) {
                    counter++;
                }
            }
            return counter;
        }

        public static Map<String, Integer> getUniqueWords(String text) {
            Map<String, Integer> map = researchText(text);
            Map<String, Integer> mapUniqe = new HashMap<>();

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                Integer value = entry.getValue();
                if (value == 1) {
                    //mapUniqe.put(entry.getKey(), entry.getValue());
                    mapUniqe.put(entry.getKey(), 1);
                }
            }
            return mapUniqe;
        }

        public static int getFrequencyUsingWord(String text) {
            Map<String, Integer> map = researchText(text);
            int counter = 0;
            if (map.containsKey("word")) {
                counter = map.get("word");
            }
            return counter;
        }

        public static Map<String, Integer> getWordFrequencyDesc(String text, boolean isAscendingFrequency) {
            HashMap<String, Integer> map = (HashMap<String, Integer>) researchText(text);
            map = sortByValue(map, isAscendingFrequency);
            return map;
        }


        public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm, boolean isAscendingFrequency) {
            // Create a list from elements of HashMap
            List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
            // Sort the list
            if (isAscendingFrequency) {
                Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return (o1.getValue()).compareTo(o2.getValue());
                    }
                });
            } else {
                Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return (o2.getValue()).compareTo(o1.getValue());
                    }
                });
            }
            // put data from sorted list to hashmap
            HashMap<String, Integer> temp = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> aa : list) {
                temp.put(aa.getKey(), aa.getValue());
            }
            return temp;
            //https://www.geeksforgeeks.org/sorting-a-hashmap-according-to-values/
            //компараторы
        }

}
