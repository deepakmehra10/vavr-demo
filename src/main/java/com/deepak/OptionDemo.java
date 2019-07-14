package com.deepak;

import io.vavr.control.Option;

public class OptionDemo {
    
    public static void main(String[] args) {
        Option<String> value = Option.some("Deepkak");
        Option<String> value1 = Option.none();
        System.out.println(value.map(a -> a).getOrElse("Default name"));
        System.out.println(value1.map(a -> a).getOrElse("Default name"));
    }
}
