package workshop02;

public class TvTest {
	public static void main(String[] args) {
		Tv tvArray[] = new Tv[3];
		tvArray[0] = new Tv("INFINIA", 1500000, "LED TV");
		tvArray[1] = new Tv("XCANVAS", 1000000, "LCD TV");
		tvArray[2] = new Tv("CINEMA", 2000000, "3D TV");

		int[] index = new int[2]; // 0번째 가장 비싼 인덱스, 1번째 가장 저렴한 인덱스
		int cheap = tvArray[0].getPrice();
		int expensive = tvArray[0].getPrice();
	
		
		for(int i=0; i<tvArray.length; i++) {
			System.out.println(tvArray[i].toString());
			if(tvArray[i].getPrice()>expensive) { 
				index[0] = i;
				expensive = tvArray[i].getPrice();
			}
			if(tvArray[i].getPrice()<cheap) {
				index[1] = i;
				cheap = tvArray[i].getPrice();
			}
		}
		
//		System.out.println(index[0]);
//		System.out.println(index[1]);
		System.out.println("가격이 가장 비싼 제품: " + tvArray[index[0]].getName());
		System.out.println("가격이 가장 저렴한 제품: " + tvArray[index[1]].getName());
	}
}
