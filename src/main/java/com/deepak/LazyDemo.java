package com.deepak;

import io.vavr.Lazy;

public class LazyDemo {
    
    public static void main(String[] args) {
        Lazy<String> name = Lazy.of(() -> "Deepak");
        System.out.println(name.isEvaluated()); //false
        System.out.println(name.get());  //Deepak
        System.out.println(name.isEvaluated()); //True
        System.out.println(name.get()); //Deepak, from cache
    }
}
