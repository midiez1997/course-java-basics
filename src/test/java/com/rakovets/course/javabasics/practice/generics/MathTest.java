package com.rakovets.course.javabasics.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {

    @Test
    void maxValueFrom3ParametersTest() {
        Math math = new Math();
        //math.maxValueFrom3Parameters(1,5,7); сместили эту строку ниже:
        Assertions.assertEquals(7, math.maxValueFrom3Parameters(1,5,7));
        Assertions.assertEquals(10, math.maxValueFrom3Parameters(4,0,10));
        Assertions.assertEquals(-1, math.maxValueFrom3Parameters(-3,-1,-2));
    }

    @Test
    void minValueFrom5ParametersTest() {
        Math math = new Math();
        Assertions.assertEquals(1, math.minValueFrom5Parameters(1,5,7, 8, 11));
        Assertions.assertEquals(-10, math.minValueFrom5Parameters(4,0,10, -5, -10));
        Assertions.assertEquals(-3, math.minValueFrom5Parameters(-3,-1,-2, 3, 5));
    }

//    @Test
//    void getAverageValueFromArrayTest() {
//        Math math = new Math();
//          Assertions.assertEquals(7, getAverageValueFromArray(1,5,7,3,4));
////        Assertions.assertEquals(10, getAverageValueFromArray(4,0,10));
////        Assertions.assertEquals(-1, getAverageValueFromArray(-3,-1,-2));
//    }

//    @Test
//    void getMaximumFromArrayTest() {
//        Math math = new Math();
//        Assertions.assertEquals(1, math.getMaximumFromArray());
//    }


}
