package main.java.factory;

import main.java.convertor.BuzzConvertor;
import main.java.convertor.FizzBuzzConvertor;
import main.java.convertor.FizzConvertor;
import main.java.convertor.IConvertor;
import main.java.convertor.InvariableConvertor;

public class Game1ConvertorFactory {
	
	public static IConvertor getAProperConvertor(int num) {
		IConvertor convertor = InvariableConvertor.getInstance();
		if(num%15==0) {
			convertor = FizzBuzzConvertor.getInstance();
		}else if(num%5==0) {
			convertor = BuzzConvertor.getInstance();
		}else if(num%3==0) {
			convertor = FizzConvertor.getInstance();
		}
		
		return convertor;
	}
	

}
