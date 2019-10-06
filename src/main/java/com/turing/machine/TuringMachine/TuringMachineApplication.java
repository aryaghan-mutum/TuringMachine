package com.turing.machine.TuringMachine;

import com.turing.machine.TuringMachine.Entscheidungsproblem.BinaryDigitsWithSpaces;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

import static com.turing.machine.TuringMachine.Entscheidungsproblem.BinaryDigits.printBinaryDigits;
import static com.turing.machine.TuringMachine.Entscheidungsproblem.BinaryDigitsWithSpaces.printBinaryDigitsWithSpaces;
import static com.turing.machine.TuringMachine.Entscheidungsproblem.BinaryToRational.convertBinaryToRationalNumbersWithOneDigitInTheStart;
import static com.turing.machine.TuringMachine.Entscheidungsproblem.BinaryToRational.convertBinaryToRationalNumbersWithZeroDigitInTheStart;

@SpringBootApplication
public class TuringMachineApplication implements CommandLineRunner {
	
	private static List<String> binaryNumList = new ArrayList();
	
	public static void main(String[] args) {
		SpringApplication.run(TuringMachineApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
		
		printBinaryDigits();
		
		convertBinaryToRationalNumbersWithZeroDigitInTheStart(binaryNumList);
		
		convertBinaryToRationalNumbersWithOneDigitInTheStart(binaryNumList);
		
		printBinaryDigitsWithSpaces();
		
		
	}

}
