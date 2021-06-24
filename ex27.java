package examples;
public class ex27 {
	public static void main(String[] args) {
		//이상   크다 || 같다  >=  
		//이하   작다 || 같다  <=
		//초과   크다           >
		//미만   작다           <
		//연습문제
		// 철수가 시장에 갔다. 
		// 사과를 한개 사려는데, 사과값이 1000원 단위이면 사고,
		// 아니면 안살려고 한다.
		// 그리고 5000원 이상이면 안살려고 한다.
		// 사과 값이 3000원일때, 살지 안살지를 true, false로
		// 표현하시오.
		int apple = 3000;
		System.out.println( apple%1000==0 && apple<5000 );
	}
}