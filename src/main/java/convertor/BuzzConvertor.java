package main.java.convertor;

public class BuzzConvertor implements IConvertor {
	
	private static BuzzConvertor uniqueInstance = new BuzzConvertor();
	
	public static BuzzConvertor getInstance() {
		return uniqueInstance;
	}

	public String getConvertedNumber(int num) {
		// TODO Auto-generated method stub
		return "Buzz";
	}

}
