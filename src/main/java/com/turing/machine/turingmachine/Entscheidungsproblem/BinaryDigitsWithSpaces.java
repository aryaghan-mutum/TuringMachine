package com.turing.machine.turingmachine.Entscheidungsproblem;

import static com.turing.machine.turingmachine.config.Constants.N;
import static com.turing.machine.turingmachine.config.Constants.ONE;
import static com.turing.machine.turingmachine.config.Constants.ZERO;
import static java.lang.String.format;
import static java.lang.System.out;

public class BinaryDigitsWithSpaces {
    
    static public void
    printBinaryDigitsWithSpaces() {
        
        out.println();
        out.println("Print Binary Digits With Spaces:");
        out.println("-----------------------------");
        
        for (int i = 0; i < N; ++i) {
            
            String binaryDigitWithSpaces = format("%s %s", ZERO, ONE);
            out.print(binaryDigitWithSpaces);
            out.print(" ");
            
        }
        
        out.print("\n");
        out.println("-----------------------------");
    }
    
}
