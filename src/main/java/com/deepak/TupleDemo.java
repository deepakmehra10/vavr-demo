package com.deepak;

import io.vavr.Tuple;
import io.vavr.Tuple2;

public class TupleDemo {
    
    public static void main(String[] args) {
        Tuple2<Integer, Integer> tuple2 = Tuple.of(1, 2);
        System.out.println(tuple2._1); // to retrieve first value from Tuple
        System.out.println(tuple2._2); // to retrieve second value from Tuple
        System.out.println(getStatus()); // function returning multiple values with the help of Tuple
        
        Tuple2<String, String> transformedTuple = getStatus().map(first -> first.concat(" 403"),
                second -> second.concat(" 200")); // transforming values of a tuple
        
        System.out.println(transformedTuple);
    }
    
    private static Tuple2<String, String> getStatus() {
        return Tuple.of("Rejected", "Passed");
    }
}
