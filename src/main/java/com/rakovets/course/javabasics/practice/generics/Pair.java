package com.rakovets.course.javabasics.practice.generics;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }




//    == Project: `Pair`
//
//    Создать класс `Pair`, параметризованный двумя параметрами `K` и `V`:
//
//            * хранить две переменные типов `K` и `V` соответственно
//* иметь конструктор, принимающий 2 параметра типов `K` и `V`
//            * соответствующие геттеры/сеттеры
//
//    Создать `final` класс `PairUtil`:
//
//            * иметь статический обобщённый метод `swap()`, принимающий объект класса `Pair` и возвращать пару, в которой элементы
//    поменялись местами
}
