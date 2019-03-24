package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.FizzBuzzGame2Simulator;

public class FizzBuzzGame2SimulatorTest {

	@Test
	public void test() {
		
		FizzBuzzGame2Simulator simulator = new FizzBuzzGame2Simulator();
		
		for (int i =1; i<=100; i++) {
			if((i%5==0 || String.valueOf(i).contains("5")) && (i%3==0 || String.valueOf(i).contains("3"))) {
				assertEquals("FizzBuzz",simulator.getConvertedNumber(i));
			}else if(i%5==0 || String.valueOf(i).contains("5")) {
				assertEquals("Buzz",simulator.getConvertedNumber(i));
			}else if(i%3==0 || String.valueOf(i).contains("3")) {
				assertEquals("Fizz",simulator.getConvertedNumber(i));
			}else {
				assertEquals(String.valueOf(i),simulator.getConvertedNumber(i));
			}
			
		}
	}

}
