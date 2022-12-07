package euc.kh.variable.ex1;

public class VariableExample3 {
		/*
		 * 형변화(casting): 값의 자료형을 변환하는것( 단 boolean은 불가)
		 * 
		 * 형병환을 하는 이유
		 * 컴퓨터는 기본적으로 같은 자료형끼리만 연산이 가능하다
		 * 다른 자료형과 연산 시 오류가 발생한다
		 * --> 이런 상황을 해결하기 위해 필요한 기술이 형변환이다.
		 * 
		 *  자동/ 강제 형변환 두가지가 존재한다
		 */
	
		// 자동 형변환
		// -[값의 범위]가 큰 자료형과 [값의 범위]가 작은 자료형 연산시
		// 작은 자료형 -> 큰 자료형으로
		// 컴파일러에 의해 자동적으로 변환된다.

	public static void main(String[] args) {
		
		int num1 = 10;
		double num2 = 3.5;
		
		System.out.println(num1 + num2);
		//원래 에러가 발생해야 하지만 "자동 형변환"에의하여 에러없이 연산이 됨
		
		int i1 = 3;
		double d1 = i1; // double은 실수만 저장될 수 있는 자료형이지만 
						// 정수가 대입 되는 연산이 수행되면 
		
		System.out.println("i1 " +i1); //3 
		System.out.println("d1: " +d1); // 3.0
		
		System.out.println(d1 + num2); // double + double
		
		//char 문자형 자료형
		//char 자료형은 문자형이지만 실제 저장하는 값은
		// 0부터 6만 5천 사이에 있는 숫자이다.
		char ch = 'v';
		int i3 = ch; //int 변수에 char 값을 대입 하여 int형으로 자동 변환한다
		
		System.out.println("i3 :" +i3);// v는 유니코드 상에서 118이라는 값이 매핑되어있다.
		
		char ch1 = '각';
		int i4 = ch1;
		
		System.out.println("i4 :" +i4);// 각은 유티코드상에서 44033이라는 값이 매핑되어있다.
		}

}
