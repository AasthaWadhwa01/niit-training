package junit;

public class MockUtil extends Util{

	private String expectedResult;
	
	public void setExpectedResult(String expectedResult){
		this.expectedResult = expectedResult;
	}

	public String convert(int n) {
		
		return expectedResult;
	}

}
