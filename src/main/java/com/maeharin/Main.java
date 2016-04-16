package com.maeharin;

import com.maeharin.lib.Utils;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main (String[] args) {
        String message = "Hello World!";
        System.out.println(StringUtils.left(message, 5));

        String foo = Utils.foo();
        System.out.println(foo);
    }
}