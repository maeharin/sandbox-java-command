package com.maeharin;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String message = "Hello World!";
        System.out.println(StringUtils.left(message, 5));
    }
}
