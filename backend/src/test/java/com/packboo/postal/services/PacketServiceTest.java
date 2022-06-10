package com.packboo.postal.services;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class PacketServiceTest {

    @Autowired
    private PacketServiceCorreios packetService;

    @Test
    public void checkBalance() {
        Assert.assertEquals(new BigDecimal("59009.63"), packetService.checkBalance());
    }
}
