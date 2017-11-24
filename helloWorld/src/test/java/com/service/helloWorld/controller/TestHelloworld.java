package com.service.helloWorld.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;

public class TestHelloworld {

    HelloworldImpl helloworldImpl;

    @Before
    public void setup() throws Exception{
        Log4jUtils.init();
        BeanUtils.init();
        helloworldImpl = BeanUtils.getBean("helloworldImpl");
    }



    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: helloworldImpl.helloworld(String name)
        String returnValue = helloworldImpl.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}