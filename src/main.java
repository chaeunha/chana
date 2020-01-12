import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// 가위바위보 만들기
		// 조건1.콘솔로 작동하는 게임=출력문으로
		// 조건2.숫자로 하여금 판단하는 게임=1:가위 2:바위 3:보
		// 조건4.내가 직접 입력하고 컴퓨터는 무작위의 숫자를 낼 것
		Scanner sc = new Scanner(System.in);
		// 가위바위보
		// 숫자1:가위 2:바위 3:보
		// Math.random()0*3<=x<1*3 =>*3
		// 0<=x<3 => =+1
		// 1<= x <4
		System.out.println("가위바위보 시작");
		System.out.println("숫자를 입력해주세요");
		System.out.println("가위:1 바위:2  보:3");
		System.out.print("입력 : ");
		int inputRps = sc.nextInt();
		int cpuRps = (int) (Math.random() * 3 + 1);
		System.out.println("컴퓨터 : " + cpuRps);
		System.out.println("");
		if (inputRps == cpuRps) {
			System.out.println("비겼습니다");
		} else {
			if ((inputRps == 1 && cpuRps == 2) || (inputRps == 2 && cpuRps == 3) || (inputRps == 3 && cpuRps == 1)) {
				System.out.println("졌습니다");
			} else {
				System.out.println("이겼습니다");

			}
		}
	}
}
