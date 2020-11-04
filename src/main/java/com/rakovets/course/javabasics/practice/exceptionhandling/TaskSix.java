package com.rakovets.course.javabasics.practice.exceptionhandling;

public class TaskSix {
    public static void main(String[] args) {
        final int min = 1;
        final int max = 3;
        final int rnd = rnd(min, max);
        System.out.println(rnd);
        try {
            String result = rnd();
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }
        public static int rnd(int min,int max) throws Exception {
        max -= min;
        return (int) (Math.random() * ++max) + min;
//            if (rnd == 1) {
//                throw new Exception("Exception для 1-го числа");
//            } else if (rnd == 2) {
//                throw new Exception("Exception для 2-го числа");
//            } else (rnd == 3) {
//                throw new Exception("Exception для 3-го числа");
//            }
    }


}
