package workshop01;


//1~num 사이의 3의 갯수 구하기 
public class Problem3 {
	public static void main(String[] args) {
		int num = 12345;
		int rt, lt=1, cur, count=0, k=1;
		
		while(lt!=0) {
			lt=num/(k*10);
			rt=num%k;
			cur = (num/k)%10;
			
			System.out.println(lt + " " + rt + " " + cur);
			
			//12345, 5를 뽑는 방법. 
			if(cur>3) {
				count+=((lt+1)*k);
			} else if(cur<3) {
				count+=(lt*k);
			}else {
				count+=((lt*k)+(rt+1));
			}		
			k*=10;
			
		}
		
		System.out.println(count);

	}
}
