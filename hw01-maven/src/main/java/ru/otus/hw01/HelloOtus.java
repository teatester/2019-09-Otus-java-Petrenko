package ru.otus.hw01;

import com.google.common.base.Splitter;

import java.util.ArrayList;
import java.util.List;

public class HelloOtus {
    public static void main(String[] args) {
       PrintSplit( "Hello Otus" );
    }
    private static void PrintSplit(String aStr){
        List<String> words= Splitter.on( " ").splitToList( aStr );

        for (String w:words  ) {
            System.out.println( w );
        }
    }

}
