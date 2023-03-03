package study;

//@FunctionalInterface
//interface MyLambdaFunction {
//    int max(int a, int b);
//}

@FunctionalInterface
interface MyLambdaFunction{
	int max(int a, int b);
}


interface MyMultipleFunction{
	int 
}

public class Lambda {

    public static void main(String[] args) {

        // 람다식을 이용한 익명함수
//        MyLambdaFunction lambdaFunction = (int a, int b) -> a > b ? a : b;
//        System.out.println(lambdaFunction.max(6, 5));
    	MyLambdaFunction lam = (int a, int b) -> a > b ? a : b;
    	System.out.println(lam.max(3, 10));
    }

}