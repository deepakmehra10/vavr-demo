package com.deepak;

import io.vavr.Function1;
import io.vavr.control.Either;

import java.util.function.Function;

public class EitherDemo {
    
    public static void main(String[] args) {
        Either<String, Integer> integers = functionWithEither(0).right().map(value -> value + 1).toEither();
        if (integers.isRight()) {
            System.out.println(integers.get());
        }
        System.out.println(integers.getLeft());
    }
    
    private static Either<String,Integer> functionWithEither(int number) {
        if (number >0) {
            return Either.right(number);
        }
        return Either.left("Please input a valid number");
    }
}
