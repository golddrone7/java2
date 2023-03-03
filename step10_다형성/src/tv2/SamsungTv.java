package tv2;

public class SamsungTv implements Tv {
	@Override
	public void powerOn() {
		System.out.println("Samsung TV - 전원을 켠다");
	}
	@Override
	public void powerOff() {
		System.out.println("Samsung TV - 전원을 끈다");
	}
	@Override
	public void soundOn() {
		System.out.println("Samsung TV - 소리를 높인다");
	}
	@Override
	public void soundOff() {
		System.out.println("Samsung TV - 전원을 켠다");
	}
}
