package com.rakovets.course.javabasics.practice.generics;

public class Math {

   // 1 task
   public int maxValueFrom3Parameters(int x, int y, int z) {
       return java.lang.Math.max(x, java.lang.Math.max(y, z)); // через класс Math.max( идем справа налево)
   }

   // 2 task
    public int minValueFrom5Parameters(int x, int y, int z, int r, int v) {
        return java.lang.Math.min(x, java.lang.Math.min(y, java.lang.Math.min(z, java.lang.Math.min(r, v)))); // через класс Math.min( идем справа налево)
    }

   // 3 task
    public int getAverageValueFromArray(int[] arr) {
            double[] arrqq = {19, 12.89, 16.5, 200, 13.7}; // создали массив и перечислили его элементы
            int total = 0; // создали переменную, в которой будем суммировать значения.
            for (int i = 0; i < arr.length; i++) {
                total = total + arr[i]; // просуммировали их
            }
            return total / arr.length; // узнали среднее
    }

    // 4 task
    public int getMaximumFromArray(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    //5 Task
    public int getMinimumFromArray(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }

    //6 Task java сортировка пузырьком
    public int[] sortArrayByBubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // 7 Task
    public static void binarySearch(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }
}
