package ch01;

public class _01_VariableEx {
	public static void main(String[] args) {
		/*
		 * 자바 프로그램의 첫시작을 나타내는 main()메서드 => 소문자로 시작함
		 * 자바가상머신(JVM, Java Virtual Machine)이 프로그램을 시작하기 위해 호출하는 메서드
		 */
		System.out.println("*** 변수 ***\n");
		System.out.println("변수 : 하나의 값을 저장할 수 있는 메모리 공간");
		
		/*
		 * 변수 선언 및 대입 => 자료형 변수명 = 값;
		 * 변수는 소문자로 시작(무조건)
		 * 해당 자료형에 맞게 대입되어야 함.
		 */
		
		System.out.println("*** 나의 정보 ***\n");
		
		int favorite = 7; // 좋아하는 숫자
		System.out.println("좋아하는 숫자 : "+favorite);
		
		String name = "지명준"; // 내 이름
		System.out.println("이름 : "+name);
		
		String address = "서울"; // 내 주소
		System.out.println("주소 : "+address);
		
		String dream = "자유"; // 내 꿈
		System.out.println("과거의 꿈 : "+dream);
		
		dream = "돈 많은 백수";
		System.out.println("현재의 꿈 : "+dream);
		
		char bloodType = 'A';
		String blood = "A";
		System.out.println("혈액형 : "+bloodType+"형\n");
		System.out.println("-----------------------");
		
		// \t=>탭, \n=>줄바꿈
		System.out.println("좋아하는 숫자 : "+favorite+"\t이름 : "+name+"\t꿈 : "+dream+"\t혈액형 : "+bloodType);
		System.out.println("-----------------------");
		System.out.println("좋아하는 숫자 : "+favorite+"\n이름 : "+name+"\n꿈 : "+dream+"\n혈액형 : "+bloodType);
		
	}

}
