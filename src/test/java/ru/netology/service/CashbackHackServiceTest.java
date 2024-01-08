package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {
    @Test
    public void test() {
        CashbackHackService service = new CashbackHackService();
        int amount = 150;
        int actual = service.remain(amount);
        int expected = 850;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void test5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 300;
        int actual = service.remain(amount);
        int expected = 700;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void test1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void test2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);

    }
}

