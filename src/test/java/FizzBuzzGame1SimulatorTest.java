package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.FizzBuzzGame1Simulator;

public class FizzBuzzGame1SimulatorTest {

	@Test
	public void test() {
		
		FizzBuzzGame1Simulator simulator = new FizzBuzzGame1Simulator();
		
		for (int i =1; i<=100; i++) {
			if(i%15==0) {
				assertEquals("FizzBuzz",simulator.getConvertedNumber(i));
			}else if(i%5==0) {
				assertEquals("Buzz",simulator.getConvertedNumber(i));
			}else if(i%3==0) {
				assertEquals("Fizz",simulator.getConvertedNumber(i));
			}else {
				assertEquals(String.valueOf(i),simulator.getConvertedNumber(i));
			}
			
		}
	}

}
