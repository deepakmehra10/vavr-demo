package com.deepak;

import io.vavr.CheckedFunction0;
import io.vavr.CheckedFunction1;
import io.vavr.concurrent.Future;

public class FutureDemo {
    public static void main(String[] args) {
        CheckedFunction0<Integer> checkedFunction1 = () -> 2;
        Future<Integer> of = Future.of(checkedFunction1);
        System.out.println(of.get());
    }
}
