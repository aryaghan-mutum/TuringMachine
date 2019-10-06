package com.turing.machine.TuringMachine.Entscheidungsproblem;

import static com.turing.machine.TuringMachine.config.Constants.N;
import static com.turing.machine.TuringMachine.config.Constants.ONE;
import static com.turing.machine.TuringMachine.config.Constants.ZERO;
import static java.lang.System.out;

public class BinaryDigits {
    
    public static void printBinaryDigits() {
        
        out.println("Print Binary Digits:");
        out.println("-----------------------------");
        
        for (int i = 0; i < N; ++i) {
            out.print(ZERO + ONE);
        }
        
        out.print("\n");
        out.println("-----------------------------");
    }
    
}
