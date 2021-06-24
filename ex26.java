package examples;
public class ex26 {
	public static void main(String[] args) {
		// 연습문제
		int i = 20;
		//1. i값이 10보다 크고, 30보다 작은가?
		System.out.println(i>10&&i<30);
		//2. i값이 13보다 크고, 21보다 작은가?
		System.out.println(i>13&&i<21);
		//3. i값이 15보다 크거나, 50보다 작거나 같은가?
		System.out.println(i>15||i<=50);
		//4. i값이 10보다 크면서, 30보다 작은가?
		System.out.println(i>10&&i<30);
		// true/false로 표현하시오.
		
		int j = 10;
		// j값이 2의 배수이고 3의 배수인지를 
				// true / false로 출력하시오.
		System.out.println(j%2==0&&j%3==0);
		// j값이 10보다 크거나 같고, j값이 5의 배수이면
	    // true, 아니면 false로 출력하시오.
		System.out.println(i>=10&&j%5==0);
	}
}
