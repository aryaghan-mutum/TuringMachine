package com.turing.machine.TuringMachine.Entscheidungsproblem;

import java.util.ArrayList;
import java.util.List;

import static com.turing.machine.TuringMachine.config.Constants.DOT;
import static com.turing.machine.TuringMachine.config.Constants.N;
import static com.turing.machine.TuringMachine.config.Constants.ONE;
import static com.turing.machine.TuringMachine.config.Constants.ZERO;
import static com.turing.machine.TuringMachine.turinghelper.TuringHelper.addDotToTheStart;
import static com.turing.machine.TuringMachine.turinghelper.TuringHelper.convertDecimalToFraction;
import static java.lang.Double.parseDouble;
import static java.lang.String.format;
import static java.lang.System.out;

public class BinaryToRational {
    
    public static void convertBinaryToRationalNumbersWithZeroDigitInTheStart(List<String> binaryNumList) {
    
        out.println();
        
        for (int i = 0; i < N; i++) {
            binaryNumList.add(ZERO);
            binaryNumList.add(ONE);
        }
        
        String binaryNum = "";
        for (String n : binaryNumList) {
            binaryNum = binaryNum + n;
        }
        
        binaryNum = addDotToTheStart(DOT, binaryNum);
        
        String fractionNum = convertDecimalToFraction(parseDouble(binaryNum));
        
        out.println(format("BinaryNum: %s is converted to FractionNum: %s ", binaryNum, fractionNum));
    }
    
    public static void convertBinaryToRationalNumbersWithOneDigitInTheStart(List<String> binaryNumList) {
    
        out.println();
        
        List<String> bList = new ArrayList<>();
        
        String binaryNum = "";
        for (String n : binaryNumList) {
            
            if(n.equals("0")) {
                n = ONE;
                binaryNum = binaryNum + n;
                bList.add(n);
            }
            else if (n.equals("1")) {
                n = ZERO;
                binaryNum = binaryNum + n;
                bList.add(n);
            }
        }
        
        binaryNum = addDotToTheStart(DOT, binaryNum);
        
        String fractionNum = convertDecimalToFraction(parseDouble(binaryNum));
        
        out.println(format("BinaryNum: %s is converted to FractionNum: %s ", binaryNum, fractionNum));
    }
    
}
