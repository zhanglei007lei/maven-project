package com.maven.java.project.my_app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest
{
    @Test
    public void testSayHello()
    {
        HelloWorld helloWorld = new HelloWorld();

        String result = helloWorld.sayHello();
        System.out.println(result);
        assertEquals( "Hello Maven", result );
       
    }
}