package edu.kh.variable.ex2;

public class PrintExample {
	public static void main(String[] args) {
		
		// System.out.println() : 한줄 출력 후 줄버꿈 ==개행
		// System.out.print() : 단순출력 (개행이 없다)
		// 줄바꿈이라는 차이점이 있지만, 괄호안의 내용이 그대로 출력된다는 것은 똑같다.
		
		System.out.println("테스트");
		System.out.println("테스트2");
		
		System.out.print("테스트3");
		System.out.println(); // 단순 개행(줄바꿈)
		System.out.print("테스트");
		
		System.out.println();
		
		//System.out.printf() : 출력될 문자열 형식을 패턴으로 지정하는 출력문구
		
		int iNum1 = 10;
		int iNum2 = 5; 
		
		//10 + 5 =15
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		//길고 오타날 가능성이 크다
		
		//System.out.printf("패턴", 패턴에 들어갈 값);
		System.out.printf("%d + %d = %d", iNum1, iNum2, iNum1 + iNum2);
		
		//printf도 print와 같이 개행이 되지 않기떄문에
		// \n과 같은 개행문자(escape)를 사용하여 다음줄로 개행가능 
		
		//10 + 10 * 5 / 2 =35
		System.out.printf("%d + %d * %d / 2 = %d\n", iNum1, iNum1, iNum2, 
				iNum1 + iNum1 * iNum2 / 2 
				);
		
		int iNum3 = 3;
		System.out.printf("%5d\n", iNum3); // 5칸 공간 확보후 오른쪽 정렬
		System.out.printf("%-5d\n", iNum3);// 5칸 공간 확보후 왼쪽 정렬
		
		//소수점 자리제어
		System.out.printf("%f\n", 2.5); //2.500000 f포함
		System.out.printf("%.2f\n", 2.5);// 소수점 둥째자리 까지만 나타낸다면 f앞에 .2
		System.out.printf("%.0f\n", 2.5);// 소수점 표현 X
		
		// escape (이스케이프 == 탈출) 문자 : 일반 문자가 아닌 특수 문자 표현
		System.out.println("\\"); // 역슬래시 출력은 2번쓰기
		System.out.println("a\tb\tc\td"); // tap //a	b	c	d //정해진 공간 만큼 띄어쓰기
		
		System.out.println("\"");
		System.out.println("\'");
		
		//유니코드 이스케이프
		// 65 = A
		System.out.println("\u0041"); //65를 16진수로 나타내면 0041
		
		
		
		
		
	}
	

}
