import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest { 
	public static void main(String[] args) { 
			
		System.out.println("hw5_1 : 손창하");

		// (1) 공백 리스트 list를 생성 - 정수형(Integer) 원소를 저장할 ArrayList 객체 생성
		 ArrayList<Integer> list = new ArrayList<Integer>();



		Scanner scanner = new Scanner(System.in);
		System.out.println("메뉴 번호를 입력하세요.");
		int menu = 0;
		int item = 0;

		// 종료를 선택할 때까지 반복하여 메뉴를 제공하고 해당 연산을 수행
		do {
			System.out.print("1:삽입 2:인덱스삽입 3:길이조회 4:전체조회 5:종료 --->");
			menu = scanner.nextInt();
			switch(menu) {
			    
			case 1:
				System.out.print("삽입할 정수 입력:");		 
				item = scanner.nextInt();
				// (2) 리스트에 item을 삽입
				list.add(item);
				break;				
				
			case 2:
				System.out.print("삽입 인덱스 입력:");
				int index = scanner.nextInt();
				System.out.print("삽입할 정수 입력:");
				item = scanner.nextInt();
				// (3) 리스트의 index 위치에 item을 삽입
				list.add(index, item);
				break;
			case 3:
				System.out.print("리스트 길이  = ");
				// (4) 리스트의 길이를 출력
				System.out.println(list.size());			 
				break;
			case 4:
				System.out.print("리스트 = ");
				// (5) 리스트의 내용을 모두 출력
				System.out.println(list.toString());	 
				break; 
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("메뉴 번호 오류: 메뉴를 다시 선택하세요.");
			}
		} while(menu != 5);
		
		scanner.close();
	}
}


