import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		showMenu();
	}
	
	static int showMenu() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("-- �� �� --");
		System.out.println("1. ���ϱ�");
		System.out.println("2. ����");
		System.out.println("��ȣ�� �Է��ϼ���._>");
		num = sc.nextInt();
		return num;
	}

}
