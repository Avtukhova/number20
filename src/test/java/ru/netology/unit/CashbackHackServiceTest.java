package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    public void shouldReturnRemainIfAmountIs800() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 800;
        int expected = 200;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

}