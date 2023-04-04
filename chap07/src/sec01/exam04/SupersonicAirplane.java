package sec01.exam04;

public class SupersonicAirplane extends Airpane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC =2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly(); // Airplane의 fly()메소드 호출
		}
	}
}
