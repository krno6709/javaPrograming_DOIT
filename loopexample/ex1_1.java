package loopexample;

public class ex1_1 {

	public static void main(String[] args) {
		int num1=10;
		int num2=2;
		char operator = '+';
		int result =0;
		
		switch(operator) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		
		default:
			result=num1/num2;
			break;
		}
		System.out.println(result);
	}

}
