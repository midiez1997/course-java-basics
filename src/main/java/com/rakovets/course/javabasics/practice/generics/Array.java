package com.rakovets.course.javabasics.practice.generics;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array <T extends Number> {

    private int capacity;
    private Number[] array;

    public Array(int capacity) {
        array = new Number[capacity];
        this.capacity = capacity;
    }

    public void inArray() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < capacity; i++) {
            String s = in.next();
            array[i] = new BigDecimal(s);
        }
        in.close();
    }

    public void setRandom() {
        for (int i = 0; i < capacity; i++) {
            Random random = new Random();
            array[i] = random.nextInt();
        }
    }

    public void outArray() {
        for (Number number : array) {
            System.out.println(number.toString());
        }
    }

    public void sortArray() {
        Arrays.sort(array);
    }

    public Number[] get() {
        return array;
    }
}

//     == Project: `Array`
//        Создайте шаблонный класс `Array`, который представляет собой массив, позволяющий хранить объекты заданного типа.
//        Необходимо реализовать:
//        * заполнение массива с клавиатуры
//        * заполнение массива случайными числами
//        * отображение массива
//        * поиск максимального значения
//        * поиск минимального значения
//        * подсчет среднеарифметического значения
//        * сортировка массива по возрастанию
//        * сортировка массива по убыванию
//        * поиск значения в массиве, используя бинарный поиск
//        * замена значения в массиве на новое значение