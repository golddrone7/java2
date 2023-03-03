package tv2;

public class LgTv implements Tv {
	public void powerOn() {
		System.out.println("LG TV - 전원을 켠다");
	}
	public void powerOff() {
		System.out.println("LG TV - 전원을 끈다");
	}

	@Override
	public void soundOn() {
		System.out.println("LG TV - 소리를 높인다");
	}
	@Override
	public void soundOff() {
		System.out.println("LG TV - 소리를 줄인다");
	}
	
	
}
