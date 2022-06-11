package week1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range=8;
		int FirstNum=0;
		int SecondNum=1;
		int sum;
		System.out.println(FirstNum);
		System.out.println(SecondNum);
		for(int i = 1; i <= range; i++) {
			sum=FirstNum+SecondNum;
			FirstNum=SecondNum;
			SecondNum=sum;
			System.out.println(sum);
		}
	}

}
