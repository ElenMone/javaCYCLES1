package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrServiceTest {
    @Test
    public void rangeOne() {
        SqrService service = new SqrService();
        int expected = 3;
        int actual = service.calcSqr(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void rangeTwo() {
        SqrService service = new SqrService();
        int expected = 1;
        int actual = service.calcSqr(100, 100);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void rangeThree() {
        SqrService service = new SqrService();
        int expected = 0;
        int actual = service.calcSqr(200, 200);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void rangeFour() {
        SqrService service = new SqrService();
        int expected = 6;
        int actual = service.calcSqr(200, 400);
        Assertions.assertEquals(expected, actual);
    }
}
