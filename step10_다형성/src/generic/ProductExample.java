package generic;

import tv2.Tv;

public class ProductExample {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트 Tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
	}

}
