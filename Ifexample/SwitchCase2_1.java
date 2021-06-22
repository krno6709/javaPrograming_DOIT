package Ifexample;

public class SwitchCase2_1 {

	public static void main(String[] args) {
		int Floor;
		String Store;
		
		Floor=5;
		
		switch(Floor) {
		case 1:
			Store = "약국";
			break;
		case 2:
			Store ="정형외과";
			break;
		case 3:
			Store = "피부과";
			break;
		case 4:
			Store="치과";
			break;
		default:
			Store="헬스 클럽";
			break;
		}
		
		System.out.println(Floor+"층 "+ Store+"입니다.");

	}

}
