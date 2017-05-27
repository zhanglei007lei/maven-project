package com.maven.java.project.my_app;

public class HelloWorld {

	 public String sayHello()
	    {
	        return "update and pushed to devbranch Hello Maven";
	    }

	    public static void main(String[] args)
	    {
	        System.out.print( new HelloWorld().sayHello() );
	    }
}
