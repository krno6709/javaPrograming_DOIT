package Ifexample;

public class SwitchCase2_1 {

	public static void main(String[] args) {
		int Floor;
		String Store;
		
		Floor=5;
		
		switch(Floor) {
		case 1:
			Store = "�౹";
			break;
		case 2:
			Store ="�����ܰ�";
			break;
		case 3:
			Store = "�Ǻΰ�";
			break;
		case 4:
			Store="ġ��";
			break;
		default:
			Store="�ｺ Ŭ��";
			break;
		}
		
		System.out.println(Floor+"�� "+ Store+"�Դϴ�.");

	}

}
