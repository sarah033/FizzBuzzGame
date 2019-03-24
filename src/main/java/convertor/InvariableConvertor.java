package main.java.convertor;

public class InvariableConvertor implements IConvertor {
	
	private static InvariableConvertor uniqueInstance = new InvariableConvertor();
	
	public static InvariableConvertor getInstance() {
		return uniqueInstance;
	}

	public String getConvertedNumber(int num) {
		// TODO Auto-generated method stub
		return String.valueOf(num);
	}

}
