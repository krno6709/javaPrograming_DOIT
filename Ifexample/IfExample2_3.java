package Ifexample;

public class IfExample2_3 {

	public static void main(String[] args) {
		int score;
		char grade;
		score = 70;
		
		if(score>=90) {
			grade = 'A';
		}
		else if(score>=80) {
			grade= 'B';
		}
		else if(score>=70) {
			grade= 'C';
		}
		else if(score>=60) {
			grade= 'D';
		}
		else {
			grade='F';
		}
		System.out.println("������ "+grade+"�Դϴ�.");

	}

}
