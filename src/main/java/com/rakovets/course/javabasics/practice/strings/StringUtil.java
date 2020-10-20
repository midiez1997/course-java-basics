package com.rakovets.course.javabasics.practice.strings;

public class StringUtil {

    public String getUpperCase(String string) {
        return string.toUpperCase();
    }

    public String getConcat(String str1, String str2) { // таск 1 join(объединение) +
     return String.join(" ", str1, str2);
     }

    public int getStringIndex(String input, String charToCheck) { // таск 2 поиск буквы +
     return input.indexOf(charToCheck.toUpperCase());
    }

     public boolean getEquals(String str1, String str2) { // таск 3 сравнение двух строк equals(без учета регистра) +
        return str1.equals(str2);
    }

     public String getUpperCaseandTrim(String str) { // таск 4 trim и UpperCase +
        return str.trim().toUpperCase();
    }

    public String getStringSubstring(String str) {
        if (str.length() < 10) {
            return "<10";
        }
        String str2 = str.substring(10);
        if (str2.length() > 23) {
            String str3 = str2.substring(0, 23);
            return str3;
        }
        return str2;
    }

    public String getReplace(String str) { // таск 6 замена +
        return str.replace(":(", ":)");
    }

    public boolean getStringCompare(String str, String word) { // таск 7
        if (str.startsWith(word) && str.endsWith(word)) {
            return true;
        }
        return false;
    }

    public int getStringNumbersOfVowels(String str) { // таск 8
        int count = 0;
        char[] array = new char[]{'e', 'y', 'u', 'i', 'o', 'a'};
        for (char simb : str.toLowerCase().toCharArray()) {
            for (char vowel : array) {
                if (simb == vowel) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public int getStringNumbersOfSimbols(String str) { // таск 9
        int count = 0;
        char[] array = new char[]{'.', ',', '!'};
        for (char simb : str.toLowerCase().toCharArray()) {
            for (char vowel : array) {
                if (simb == vowel) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public String getStringRevers(String strB) { // таск 10
        StringBuilder str = new StringBuilder(strB);
        return str.reverse().toString();
    }

    public String[] getStringArraysNumbers(String str, int n) { // таск 11

        int substr = str.length() / n;
        if (str.length() % n != 0) {
            substr++;
        }
        String[] strarray = new String[substr];
        for (int i = 0; i < substr; i++) {
            strarray[i] = str.substring(i * n, Math.min((i + 1) * n, str.length()));
        }

        return strarray;
    }

    public int getStringNumbersOfWords(String str) { // таск 12
        int count = 0;
        String[] words = str.trim().replaceAll(" +", " ").split(" +");

        for (String word : words) {
            count++;
        }
        return count;
    }

    public String[] getAbbreviation(String str) { // таск 13
        String[] fio = str.toUpperCase().split(" ");
        for (int i = 0; i < fio.length; i++) {
            if (i != fio.length - 1) {
                fio[i] = fio[i].charAt(0) + ".";
            } else fio[i] = String.valueOf(fio[i].charAt(0));
        }
        return fio;
    }

    public String getStringNumbers(String str){ // таск 14
        String[] numbers = str.split("\\D");
        String result = "";
        for (int i = 0; i<numbers.length; i++){
            result = result + numbers[i];
        }
        return result;
    }

}


