import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		showMenu();
		int x, y;
		switch (sc.nextInt()){
		
		case 1:
			System.out.println("X�� �Է��ϼ���.");
			Add.add(sc.nextInt(), sc.nextInt());
		}
	
	}
	
	static void showMenu() {
	
		System.out.println("-- �� �� --");
		System.out.println("1. ���ϱ�");
		System.out.println("2. ����");
		System.out.println("��ȣ�� �Է��ϼ���._>");
		
	}

}
