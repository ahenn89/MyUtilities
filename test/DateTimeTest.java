package edu.wctc.advjava.abh.datetime;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Ashlee
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({edu.wctc.advjava.abh.datetime.datetimelab.class})
public class DateTimeTest {

    private DateTimeTest dtt;
    
    public DateTimeTest() {
    }
    
    @Before
    public void setUp() {
        dtt = new DateTimeTest();
    }
    
    @After
    public void tearDown() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullLocalDateTimeValueThrowsException(){
        DateTimeTest dtt = null;
        dtt.localDateTimeToString(dtt);
    }
    
    @Test
    public void validLocalDateTimeValuePasses(){
        LocalDateTime ldt = LocalDateTime.now();
        dtt.localDateTimeToString(ldt);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nullLocalDateTimeValueWithValidPatternThrowsException(){
        LocalDateTime ldt = null;
        String pattern = "yyyy-MM-dd HH:mm";
        dtt.localDateTimeToString(ldt, pattern);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nullLocalDateTimeValueWithInvalidPatternThrowsException(){
        LocalDateTime ldt = null;
        String pattern = "yyyy-mm-DD HH:mm";
        dtt.localDateTimeToString(ldt, pattern);
    }
    
    @Test(expected = DateTimeException.class)
    public void validLocalDateTimeValueWithInvalidPatternThrowsException(){
        LocalDateTime ldt = LocalDateTime.now();
        String pattern = "yyyy-mm-DD HH:mm";
        dtt.localDateTimeToString(ldt, pattern);
    }    
    
    @Test
    public void validLocalDateTimeValueWithValidPattern(){
        LocalDateTime ldt = LocalDateTime.now();
        String pattern = "yyyy-MM-dd HH:mm";
        dtt.localDateTimeToString(ldt, pattern);
    }  
    
}
