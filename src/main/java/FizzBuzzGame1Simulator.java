package main.java;

import main.java.convertor.IConvertor;
import main.java.factory.Game1ConvertorFactory;

public class FizzBuzzGame1Simulator {

	public static void main(String[] args) {
		
		for (int i =1; i<=100; i++) {
			
			System.out.println(getConvertedNumber(i));
			
			
		}

	}
	
	public static String getConvertedNumber(int i) {
		
		IConvertor convertor = Game1ConvertorFactory.getAProperConvertor(i);
		
		return convertor.getConvertedNumber(i);
		
	}

}
