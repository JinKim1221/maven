package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
    private Account account;

    @Before
    public void setup(){
        account = new Account();
        account.setId("abc123");
    }

    @Test
    public void getIdTest(){
        assertEquals("abc123", account.getId());
    }




}
