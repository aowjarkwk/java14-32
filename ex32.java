package examples;
import java.util.Scanner;
public class ex32 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// 연습문제
			int i = 73;
			//if else문
			//i값이 70 이상이면, "70보다 같거나 큽니다."
			//70미만이면, "70보다 작습니다." 를 출력하세요.
			if(i>=70) {
				System.out.println("70보다 같거나 큽니다.");
			}else {
				System.out.println("70보다 작습니다.");
			}
			//if else if문 사용
			//Scanner문을 이용하여,
			//정수 0~100까지를 입력받고,
			//if문을 사용하여,
			//90이상이면, "90이상입니다."
			//80이상이면, "80이상입니다."
			//70이상이면, "70이상입니다."
			//그 이하이면, "그외의 수입니다."를 출력하시오.
			System.out.println("정수 입력:");
			int a = scan.nextInt();
			if(a>=90) {
				System.out.println("90이상입니다.");
			}else if(a>=80) {
				System.out.println("80이상입니다.");
			}else if(a>=70) {
				System.out.println("70이상입니다.");
			}else {
				System.out.println("그외의 수입니다.");
			}

	}

}
