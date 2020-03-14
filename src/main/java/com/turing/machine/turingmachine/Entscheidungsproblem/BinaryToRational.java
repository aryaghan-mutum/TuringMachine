package com.turing.machine.turingmachine.Entscheidungsproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static com.turing.machine.turingmachine.config.Constants.DOT;
import static com.turing.machine.turingmachine.config.Constants.N;
import static com.turing.machine.turingmachine.config.Constants.ONE;
import static com.turing.machine.turingmachine.config.Constants.ZERO;
import static com.turing.machine.turingmachine.turinghelper.TuringHelper.addDotToTheStart;
import static com.turing.machine.turingmachine.turinghelper.TuringHelper.convertDecimalToFraction;
import static java.lang.Double.parseDouble;
import static java.lang.String.format;
import static java.lang.System.out;

public class BinaryToRational {
    
    public static void convertBinaryToRationalNumbersWithZeroDigitInTheStart(List<String> binaryNumList) {
        
        out.println();
        
        IntStream.range(0, N).forEach(b -> {
            binaryNumList.add(ZERO);
            binaryNumList.add(ONE);
        });
        
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
            
            if (n.equals("0")) {
                n = ONE;
                binaryNum = binaryNum + n;
                bList.add(n);
            } else if (n.equals("1")) {
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
