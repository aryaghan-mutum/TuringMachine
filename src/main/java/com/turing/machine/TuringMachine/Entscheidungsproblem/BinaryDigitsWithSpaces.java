package com.turing.machine.TuringMachine.Entscheidungsproblem;

import static com.turing.machine.TuringMachine.config.Constants.N;
import static com.turing.machine.TuringMachine.config.Constants.ONE;
import static com.turing.machine.TuringMachine.config.Constants.ZERO;
import static java.lang.String.format;
import static java.lang.System.out;

public class BinaryDigitsWithSpaces {
    
    public static void printBinaryDigitsWithSpaces() {
    
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
