package euc.kh.variable.ex1;

public class VariableExample1 {
		public static void main(String[] args) {
			// 메인메소드 :있어야 실행가능
			
			//명령어 끝에는 항상 ;가 있어야 오류가 없다
			System.out.println(2 * 3.141592653589793 * 5);
			System.out.println(3.141592653589793 * 5 * 5);
			System.out.println(3.141592653589793 * 5 * 5 * 20);
			System.out.println(4 * 3.141592653589793 * 5 * 5);
			
			//변수사용
			double pi = 3.14159265358973;
			int r = 5; // 반지름(radius)
			int h = 20; // 높이(height)
			
			System.out.println("=======================");
			System.out.println(2 * pi * r); // 원의 둘레 공식
			System.out.println(pi * r * r); // 원의 넓이 공식
			System.out.println(pi * r * r * h); // 원기둥의 부피 공식
			System.out.println(4 * pi * r * r); // 구의 겉넓이 공식
			
			/* 변수(Variable)
			 * - 메모리(Ram)에 값을 기록하는 공간
			 * > 공간에 기록되는 값(Data)이 변할수 있어서 변수
			 * 
			 * - 변수는 여러종류가 존재한다(저장되는 값의 형태, 크기가 다름다)
			 * 
			 * 변수 사용의 장점
			 * 1. 가독성 증가
			 * 2. 재사용성 증가 (한번 만든 변수는 계속 사용)
			 * 3. 코드 길이 감소
			 * 4. 유지 보수성 증가(코드 수정이 간단해짐)
			 * 
			 * 
			 * 
			 * 변수 선언 예시
			 * // 논리형 변수 선언 boolean  ex) 1 = 1 true
			 *  // 문자형 변수 char
			 *  // 정수형 변수  sort, int, long, byte
			 *   int는 4byte 항상 정수의 기본형  sort < int < long
			 *  // 실수형(ex 소수점) 변수 float(소수점뒤 8개), double(소수점뒤 16개)
			 *   	float은 뒤에 항상 f를 붙일것 ex) 3.14f
			 *   
			 *   //변수명의 끝에는 항상 ;를 붙여서 마칠것
			 *   ex) double pi = 3.1415926535;
			 *   
			 * 
			 */
			 
		}

}
