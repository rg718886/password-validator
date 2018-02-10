package com.example.raghdakashgari.a2;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;
public class JUNITtest {
    static Validator validator;
    @BeforeClass
    public static void init() {
        validator = new Validator();
        validator.setPassword("aAnypassword_123");
    }
    @Test
    public void cmptest() {
        boolean temp = validator.cmp(validator.getPassword());
        assertEquals(true, temp);
    }
    @Test
    public void pwtest() {
        int temp = validator.Validate(validator.getPassword());
        assertEquals(2, temp);
    }
    @Test
    public void lengthtest() {
        boolean temp =  validator.length(validator.getPassword());
        assertEquals(true,temp);
    }

    @Test
    public void uppercase1(){
        boolean temp = validator.uppercase(validator.getPassword());
        assertEquals(true, temp);
    }
    @Test
    public void specialchar1(){
        boolean temp = validator.specialchar(validator.getPassword());
        assertEquals(true, temp);
    }
    @Test
    public void digits1(){
        boolean temp = validator.digits(validator.getPassword());
        assertEquals(true, temp);
    }


}

