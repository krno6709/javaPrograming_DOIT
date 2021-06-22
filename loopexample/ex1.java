package loopexample;

public class ex1 {

	public static void main(String[] args) {
		int num1=10;
		int num2=2;
		char operator = '+';
		int sum =0;
		
		if (operator=='+') {
			sum = num1+num2;
		}
		else if(operator=='-') {
			sum = num1-num2;
		}
		else if(operator=='/') {
			sum = num1/num2;
		}
		else {
			sum=num1*num2;
		}
		System.out.println(sum);
	}

}
