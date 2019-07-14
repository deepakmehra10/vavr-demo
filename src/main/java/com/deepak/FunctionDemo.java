package com.deepak;

import io.vavr.Function1;
import io.vavr.Function2;
import io.vavr.Function3;
import io.vavr.Function4;
import io.vavr.control.Option;

public class FunctionDemo {
    
    public static void main(String[] args) {
        Function2<Integer, Integer, Integer> sum = (first, second) -> first + second;
        
        System.out.println(sum.apply(100, 100));
        
        Function3<Integer, Integer, Integer, Integer> addition = Function3.of(FunctionDemo::sumOfThreeNumbers);
        
        System.out.println(addition.apply(5, 5, 5));
        
        Function1<Integer, Integer> incrementOne = number -> number + 1;
        
        Function1<Integer, Integer> incrementTwo = number -> number + 2;
        
        //with andThen function
        Function1<Integer, Integer> resultantFunction = incrementOne.andThen(incrementTwo);
        
        System.out.println(resultantFunction.apply(5));
        
        //with compose function
        Function1<Integer, Integer> resultantFunctionWithCompose = incrementOne.compose(incrementTwo);
        System.out.println(resultantFunctionWithCompose.apply(5));
        
        //lifting
        Function2<Integer, Integer, Integer> divide = (first, second) -> first / second;
        
        Function2<Integer, Integer, Option<Integer>> lift = Function2.lift(divide);
        
        // None
        System.out.println(lift.apply(1, 0));
        
        //Some value
        System.out.println(divide.apply(1, 1));
        
        //partial application
        Function4<Integer, Integer, Integer, Integer, Integer> fourArgFunction = (a, b, c, d) -> a + b + c + d;
        
        Function2<Integer,Integer,Integer> result = fourArgFunction.apply(4,5);
    
        System.out.println(result.apply(1,2));
        
        //currying
        Function1<Integer, Function1<Integer, Function1<Integer, Integer>>> curried = fourArgFunction.curried().apply(2);
    
        System.out.println(curried.apply(2).apply(1).apply(1));
        
        //memoization
        Function2<Integer,Integer,Integer> multiply = (a,b) -> (a *b);
        Function2<Integer, Integer, Integer> memoized = multiply.memoized();
        Integer value = memoized.apply(2, 3);
        System.out.println(value);
    }
    
    private static int sumOfThreeNumbers(int first, int second, int third) {
        return (first + second + third);
    }
}
