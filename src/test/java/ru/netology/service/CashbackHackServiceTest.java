package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {
    @Test
    public void shouldAmountIs150() {
        CashbackHackService service = new CashbackHackService();
        int amount = 150;
        int actual = service.remain(amount);
        int expected = 850;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldAmountIs300() {
        CashbackHackService service = new CashbackHackService();
        int amount = 300;
        int actual = service.remain(amount);
        int expected = 700;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void shouldAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(expected, actual);

    }



}

