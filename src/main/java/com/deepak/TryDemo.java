package com.deepak;

import io.vavr.CheckedFunction0;
import io.vavr.CheckedFunction2;
import io.vavr.Function2;
import io.vavr.control.Try;

public class TryDemo {
    public static void main(String[] args) throws Throwable {
        CheckedFunction2<Integer,Integer, Integer> divide = (a, b) -> a/b ;
        Try<Integer> failure = Try.of(() -> divide.apply(5, 0));
        System.out.println(failure);
        Try<Integer> success = Try.of(() -> divide.apply(5, 1));
        System.out.println(success);
    }
    
    
}
