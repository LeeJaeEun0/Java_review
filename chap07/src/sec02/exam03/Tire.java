package sec02.exam03;

public class Tire {
	// 필드
	public int maxRotation;
	public int accumlatedRotation;
	public String location;
	
	// 생성자
	public Tire(String location, int maxRotataion) {
		this.location = location;
		this.maxRotation = maxRotataion;
	}
	
	// 메소드
	public boolean roll() {
		++accumlatedRotation; // 누적 회전수 1 증가
		if(accumlatedRotation < maxRotation) {
			System.out.println(location+" Tire 수명: "+ (maxRotation - accumlatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+"Tire 펑크***");
			return false;
		}
		
	}
}
