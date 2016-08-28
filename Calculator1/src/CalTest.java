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
			System.out.println("X를 입력하세요.");
			Add.add(sc.nextInt(), sc.nextInt());
		}
	
	}
	
	static void showMenu() {
	
		System.out.println("-- 메 뉴 --");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("번호를 입력하세요._>");
		
	}

}
