import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// ���������� �����
		// ����1.�ַܼ� �۵��ϴ� ����=��¹�����
		// ����2.���ڷ� �Ͽ��� �Ǵ��ϴ� ����=1:���� 2:���� 3:��
		// ����4.���� ���� �Է��ϰ� ��ǻ�ʹ� �������� ���ڸ� �� ��
		Scanner sc = new Scanner(System.in);
		// ����������
		// ����1:���� 2:���� 3:��
		// Math.random()0*3<=x<1*3 =>*3
		// 0<=x<3 => =+1
		// 1<= x <4
		System.out.println("���������� ����");
		System.out.println("���ڸ� �Է����ּ���");
		System.out.println("����:1 ����:2  ��:3");
		System.out.print("�Է� : ");
		int inputRps = sc.nextInt();
		int cpuRps = (int) (Math.random() * 3 + 1);
		System.out.println("��ǻ�� : " + cpuRps);
		System.out.println("");
		if (inputRps == cpuRps) {
			System.out.println("�����ϴ�");
		} else {
			if ((inputRps == 1 && cpuRps == 2) || (inputRps == 2 && cpuRps == 3) || (inputRps == 3 && cpuRps == 1)) {
				System.out.println("�����ϴ�");
			} else {
				System.out.println("�̰���ϴ�");

			}
		}
	}
}
