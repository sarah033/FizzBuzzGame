package main.java.convertor;

public class FizzBuzzConvertor implements IConvertor {
	
	private static FizzBuzzConvertor uniqueInstance = new FizzBuzzConvertor();
	
	public static FizzBuzzConvertor getInstance() {
		return uniqueInstance;
	}

	public String getConvertedNumber(int num) {
		// TODO Auto-generated method stub
		return "FizzBuzz";
	}

}
