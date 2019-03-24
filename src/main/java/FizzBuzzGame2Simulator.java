package main.java;

import main.java.convertor.IConvertor;
import main.java.factory.Game2ConvertorFactory;

public class FizzBuzzGame2Simulator {

	public static void main(String[] args) {
		for (int i =1; i<=100; i++) {
			
			System.out.println(getConvertedNumber(i));
			
			
		}

	}
	
	public static String getConvertedNumber(int i) {
		
		IConvertor convertor = Game2ConvertorFactory.getAProperConvertor(i);
		
		return convertor.getConvertedNumber(i);
		
	}

}
