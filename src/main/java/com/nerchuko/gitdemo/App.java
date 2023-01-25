package com.nerchuko.gitdemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public void addedMethod(){
       System.out.println("new method added");
    }
    public void addData(String data) {
    	if(data.equals(Constant.DATA_TYPE)) {
    		System.out.println("welcome to nerchuko batch");
    	}
    }
}
