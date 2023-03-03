package step03_제어문;
import java.util.Random;
//난수 함수 : 컴퓨터가 임의의 숫자를 발생 -> pseudo Random(슈도 랜덤)
//동일 조건이면 재현 가능(시계값, 컴퓨터 상태가 일치하면)
//OTP 거의 불가능하지만 일부 확률로 재현 가능
//가로채기
public class RandomEx {
	public static void main(String[] args) {
		// Math 클래스를 이용하는 방법
		// Random 클래스를 이용하는 방법
		System.out.println(Math.random()); // 0.0~0.999999..
		System.out.println((int)(Math.random()*10+1)); // 1이상 11미만
		System.out.println((int)(Math.random()*31+50)); //50이상 81미만
		//문제. 51~80사이의 난수 생성
		System.out.println((int)(Math.random()*30+51)); // 51이상 81미만
		//Random 클래스 이용
		
		Random rd = new Random();
		int r1 = rd.nextInt(101)+0; // 0이상 101미만
		int r2 = rd.nextInt(31)+50; // 50이상 81미만
		int r3 = rd.nextInt(41)+30; // 30이상 71미만
		System.out.println(r1+" " + r2 +" "+  r3);
//		int a = (int) (Math.random() * 30 + 1);
//		System.out.println(a);
//		Random random = new Random();
//		System.out.println(random.nextInt());
//		System.out.println(random.nextInt(10));
	}
}
