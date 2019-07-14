package com.deepak;

import io.vavr.collection.List;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListDemo {
    
    public static void main(String[] args) {
        //Java8
        Optional<Integer> reduce = Stream.of(1, 2, 3, 4, 5).reduce((a, b) -> a + b);
        System.out.println(reduce.get());
    
        //Java8
        int sum = IntStream.of(1, 2, 3, 4, 5).sum();
        System.out.println(sum);
    
        //vavr
        Number sum1 = List.of(1, 2, 3, 4, 5).sum();
        System.out.println(sum1);
        
        //Stream
        io.vavr.collection.Stream<Integer> filter = io.vavr.collection.Stream.from(2).filter(i -> i % 2 == 0);
        java.util.List<Integer> collect = filter.collect(Collectors.toList());
        System.out.println(collect);
    }
}
