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
			System.out.println("수 입력하세요.");
			System.out.println(Add.add(sc.nextInt(), sc.nextInt()));
			
		
		case 2:
			System.out.println("수입력");
			System.out.println(Substract.subst(sc.nextInt(), sc.nextInt()));
		}
	}
	
	static void showMenu() {
	
		System.out.println("-- 메 뉴 --");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("번호를 입력하세요._>");
		
	}

}
