package main.java.convertor;

public class FizzConvertor implements IConvertor {
	
	private static FizzConvertor uniqueInstance = new FizzConvertor();
	
	public static FizzConvertor getInstance() {
		return uniqueInstance;
	}
	
	public String getConvertedNumber(int num) {
		// TODO Auto-generated method stub
		return "Fizz";
	}

}
