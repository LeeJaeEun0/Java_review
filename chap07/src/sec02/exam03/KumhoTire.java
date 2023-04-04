package sec02.exam03;

public class KumhoTire extends Tire {

	// 필드
	
	// 생성자
	public KumhoTire(String location, int maxRotataion) {
		super(location, maxRotataion);
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accumlatedRotation; // 누적 회전수 1 증가
		if(accumlatedRotation < maxRotation) {
			System.out.println(location+" KumhoTire 수명: "+ (maxRotation - accumlatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+"Tire 펑크***");
			return false;
		}
		
	}

}
