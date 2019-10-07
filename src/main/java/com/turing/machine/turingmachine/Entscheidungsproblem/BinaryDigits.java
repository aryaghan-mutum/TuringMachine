package com.turing.machine.turingmachine.Entscheidungsproblem;

import static com.turing.machine.turingmachine.config.Constants.N;
import static com.turing.machine.turingmachine.config.Constants.ONE;
import static com.turing.machine.turingmachine.config.Constants.ZERO;
import static java.lang.System.out;

public class BinaryDigits {
    
    static public void
    printBinaryDigits() {
        
        out.println("Print Binary Digits:");
        out.println("-----------------------------");
        
        for (int i = 0; i < N; ++i) {
            out.print(ZERO + ONE);
        }
        
        out.print("\n");
        out.println("-----------------------------");
    }
    
}
