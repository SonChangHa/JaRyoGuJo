/* 
 * 파일명: MyArrayListTest.java
 * 작성일:  
 * 작성자: 
 * 설명: MyArrayList 객체를 생성하고 이용하는 프로그램
 */
 import java.util.Arrays;

public class MyArrayListTest { 
	public static void main(String[] args) { 		
		System.out.println("hw5_2 : 홍길동");
      
		// ... 코드를 작성하세요.
	}
}
/* 
 * 파일명: MyArrayList.java
 * 작성일:  
 * 작성자: 
 * 설명: 순차 자료구조인 배열을 이용하여 int형 리스트를 관리하는 클래스 
 */

public class MyArrayList {
	// private 인스턴스 변수 
	private int[] array;	// 리스트를 구현하는 배열	 
	private int num; 		// 리스트 길이
	
	// 생성자 : 초기 용량이 10인 공백 리스트를 생성
	public MyArrayList() {
		// 배열은 크기 10인 int형 배열로 초기화
		// 길이는 0으로 초기화하여 공백 리스트임을 표시함
		// ... 코드를 작성하세요.
		array = new int[10];
		num = 0;
	}
	
	// 정수값을 리스트 맨 뒤에 삽입하는 메소드
	public void add(int item) {
		//... 코드를 작성하세요.
		array[num] = item;
		num += 1;
	}
	
	// 인덱스 위치에 정수값을 삽입하는 메소드
	public void add(int index, int item) {
		// ... 코드를 작성하세요.
		array[index] = item;
		num += 1;
	}
	
	// 리스트 길이를 리턴하는 메소드
	public int size() {
		// ... 코드를 작성하세요.
		return num;
	}

	// 리스트의 내용을 하나의 문자열로 구성하여 리턴하는 메소드
	@Override
	public String toString() {
		// ... 코드를 작성하세요.
		//for
	}
}
