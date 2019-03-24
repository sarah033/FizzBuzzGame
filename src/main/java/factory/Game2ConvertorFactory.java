package main.java.factory;

import main.java.convertor.BuzzConvertor;
import main.java.convertor.FizzBuzzConvertor;
import main.java.convertor.FizzConvertor;
import main.java.convertor.IConvertor;
import main.java.convertor.InvariableConvertor;

public class Game2ConvertorFactory {
	
	public static IConvertor getAProperConvertor(int num) {
		IConvertor convertor = InvariableConvertor.getInstance();
		boolean isBuzzSatisfied = (num%5==0 || String.valueOf(num).contains("5"));
		boolean isFizzSatisfied = (num%3==0 || String.valueOf(num).contains("3"));
		
		if(isBuzzSatisfied && isFizzSatisfied) {
			convertor = FizzBuzzConvertor.getInstance();
		}else if(isBuzzSatisfied) {
			convertor = BuzzConvertor.getInstance();
		}else if(isFizzSatisfied) {
			convertor = FizzConvertor.getInstance();
		}
		
		return convertor;
	}
	

}
