package com.rakovets.course.javabasics.practice.strings;

public class StringUtil {
    public static void main(String[] args) {
        System.out.println(getConcat());
        System.out.println(getIndex());
        System.out.println(getEquals());
        System.out.println(getTrim());
        System.out.println(getChars());
        System.out.println(getReplace());
    }
    static String getConcat() { // таск 1 конкатенация/ join(объединение) +
     String str1 = "Hello";
     String str2 = "Dmitry Rakovets";
     String str3 = String.join(" ", str1, str2);
     System.out.println(str3);
     }
    static String getIndex() { // таск 2 поиск буквы +
     String foundx = "this sentense include x";
     int index = foundx.indexOf('x');
     System.out.println("Индекс данной буквы: " + index);
    }
     static String getEquals() { // таск 3 сравнение двух строк equals(без учета регистра) +
        String str1 = "ORDINARY WORD";
        String str2 = "ordinary word";
        System.out.println(str1.equals(str2));
    }
    static String getTrim() { // таск 4 trim и UpperCase +
        String str = " Java Basic ";
        str = str.trim();
        System.out.println(str.toUpperCase());
    }
    static String getChars() { // таск 5 +
        String str = "два фламинго стоят на тонких ногах";
        int start = 10;
        int end = 32;
        char[] dst = new char[end - start];
        str.getChars(start, end, dst, 0);
        System.out.println(dst);
    }
    static String getReplace() { // таск 6 замена +
        String str = "Listen joy division - it is :( :( :(";
        String replStr1 = str.replace(":(", ":)");
        System.out.println(replStr1);
    }

                                 // таск 7 пока непонятен

    static  String getVowels() { // таск 8

    }

    static String getQuantity() {
        String string = "В зада,нной. .строке . ,посчита,ть, количество т,очек, зап.я,тых и !!! знаков";
        int drops = 0;
        int comma = 0;
        int exclamation = 0;

        for (char ch : string.toCharArray()) { //разбиваем на массив
            if (ch == '.') {
                drops++;
            }
            else {
                if (ch == ',') {
                    comma++;
                }
            }
            else {
                if (ch == '!') {
                    exclamation++
                }
            }
        }

        System.out.println("количество точек: " + drops + "  запятых: " + comma);
    }
}


