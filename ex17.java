package examples;
import java.util.Scanner;
public class ex17 {
	public static void main(String[] args) {
		//형변환
		//연습문제
		//1.float 3.14f 변수를 선언하고 초기화하고,
		//  정수형으로 출력하시오.

		float a = 3.14f;
		System.out.println((int)a);
		
		//2. int형 12345 를 선언하고 초기화하고,
		//   실수형으로 출력하시오.

		int b = 12345;
		System.out.println((float)b);
		//3.Scanner로 실수형 변수를 입력받고,
		//소숫점 첫째자리에서 반올림하여 출력하시오. 
		//소숫점 .5이하는 0으로 버림.
		//       .5이상은 1로 올림.
		
		//반올림하는 방법 3가지
		//1.그 자릿수에서 0.5f를 더해서 버림(int형변환)
		//2.Math.round()함수
		//3.printf( "%.1f", 3.13f) - 반올림을 알아서 해줌.
		//힌트 : 실수형을 정수형으로 형변환하면, 소숫점이 날아간다.
		
		System.out.println("3번문제 실수입력:");
		Scanner scan = new Scanner(System.in);
		float c = scan.nextFloat();
		System.out.println(Math.round(c));
		
		//4. 소숫점 둘째자리에서 반올림하여 출력하시오. 
		//ex) 12.345f -> 12.3f
		//ex) 12.356f -> 12.4f
		System.out.println("4번문제 실수입력:");
		float d = scan.nextFloat();
		System.out.println(Math.round(d*10)/10.0);
		
		//5. 소숫점 셋째자리에서 반올림하여 출력하시오.
		//힌트: 자릿수 만큼 곱한 것에 반올림 한다음 형변환-버림하고
		//      그리고 그 자릿수만큼 나누면 될 것 같네요
		System.out.println("5번문제 실수입력:");
		float e = scan.nextFloat();
		System.out.println(Math.round(e*100)/100.0);
	}
}