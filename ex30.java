package examples;

public class ex30 {

	public static void main(String[] args) {
		// 조건문 if문 switch case문
		
		//if(조건문(비교,논리연산자)){
		//   조건문이 True일때 실행
		//}
		
		int i = 10;
		if(i==10) {
			System.out.println("i값은 10입니다.");
		}
		//연습문제
		//if문을 이용하여,
		//i값이 2의 배수이면, "2의 배수입니다"라고 출력하세요.
		
		if(i%2==0) {
			System.out.println("2의 배수입니다");
		}

	}

}
