package com.kodilla.patterns.singleton;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void log(){
        Logger.getInstance().log("My last log at 13:00");
    }
    @Test
    public void testGetLastLog(){
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Last log : " + lastLog);
        //Then
        Assert.assertEquals("My last log at 13:00", lastLog);
    }
}
