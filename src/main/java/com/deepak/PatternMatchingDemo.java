package com.deepak;

import static io.vavr.API.$;
import static io.vavr.API.Case;
import static io.vavr.API.Match;
import static io.vavr.Predicates.*;

public class PatternMatchingDemo {
    public static void main(String[] args) {
        String number = Match(2).of(
                Case($(1),"one"),
                Case($(2),"two"),
                Case($(),"default")
        );
    
        //conditional pattern
        String conditional = Match(1).of(
                Case($(is(1)),i -> "one" +i),
                Case($(is(2)),i -> "two" + i),
                Case($(),"default")
        );
    
        System.out.println(number);
        System.out.println(conditional);
    }
}
