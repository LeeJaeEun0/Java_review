package sec01.exam01;

public class DmCellPhone extends CellPhone {
	// 필드 
	int channel;
	
	// 생성자
	public DmCellPhone(String model, String color, int channel) {
		this.model = model; // 부모에게 상속 받음
		this.color = color; // 부모에게 상속 받음
		this.channel= channel;
	}
	
	// 메소드
	void turnOnDmb() {System.out.println("채널 " + channel +"번 DMB 방송 수신을 시작합니다.");}
	void changeChannelDmb(int channel) {System.out.println("채널 " + channel +"번으로 바꿉니다.");}
	void turnOffDmb() {System.out.println("DMB 방송 수신을 멈춥니다.");}
	
}
