package com.turing.machine.turingmachine;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

import static com.turing.machine.turingmachine.Entscheidungsproblem.BinaryDigits.printBinaryDigits;
import static com.turing.machine.turingmachine.Entscheidungsproblem.BinaryDigitsWithSpaces.printBinaryDigitsWithSpaces;
import static com.turing.machine.turingmachine.Entscheidungsproblem.BinaryToRational.convertBinaryToRationalNumbersWithOneDigitInTheStart;
import static com.turing.machine.turingmachine.Entscheidungsproblem.BinaryToRational.convertBinaryToRationalNumbersWithZeroDigitInTheStart;

@SpringBootApplication
public class TuringMachineApplication implements CommandLineRunner {
    
    static private List<String> binaryNumList = new ArrayList();
    
    static public void
    main(String[] args) {
        SpringApplication.run(TuringMachineApplication.class, args);
    }
    
    public void
    run(String... args) throws Exception {
        
        printBinaryDigits();
        
        convertBinaryToRationalNumbersWithZeroDigitInTheStart(binaryNumList);
        
        convertBinaryToRationalNumbersWithOneDigitInTheStart(binaryNumList);
        
        printBinaryDigitsWithSpaces();
        
    }
    
}
