import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		showMenu();
	}
	
	static int showMenu() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("-- 메 뉴 --");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("번호를 입력하세요._>");
		num = sc.nextInt();
		return num;
	}

}
