package examples;
public class ex23 {
	public static void main(String[] args) {
		//연습문제
		//나머지 연산자 %, 산술연산자 +-*/ 사용
		int i = 12345; 
		//만의 자릿수를 찾아오자 출력예)1
		System.out.println((i%100000-i%1000)/10000);
		//천의 자릿수를 찾아오자 출력예)2
		System.out.println((i%10000-i%1000)/1000);
		//백의 자릿수,  출력예)3
		System.out.println((i%1000-i%100)/100);
		//십의 자릿수,  출력예)4
		System.out.println((i%100-i%10)/10);
		//일의 자릿수를 찾아보세요. 출력예)5
		System.out.println(i%10);
	}
}