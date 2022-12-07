package euc.kh.variable.ex1;

public class VariableExample2 {
		public static void main(String[] args) {
			/* 자바 기본 자료형 8가지
			 * 
			 * 논리형: boolean(1byte)
			 * 정수형: byte(1byte), short(2byte), int(4byte), long(8byte)
			 * 실수형: float(4byte), double(8byte)
			 * 문자형: char(2byte, 유니코드)
			 */
			
			//변수 선언: 메모리에 값을 저장할 공간을 할당하는것
			//변수 값 대입: 변수에 값을 집어 넣는것
			
			
			boolean booleanData;
			// 메모리에 논리 값(t/f)을 저장할 공간 1byte를 할당하고
			// 할당된 공간을 booleanData라고 부르겠다.
			
			booleanData = true;
			// = : 대입연산자 ==> 오른쪽에 있는 값을 왼쪽에 대입하곘다.
			System.out.println("booleanData: " + booleanData);
			
			// 자료형은 byte 변수명 byteNumber 값 127 대입
			byte byteNumber = 127;
			/*
			 *  메모리에 정수값을 저장할 공간 1byte 할당하고
			 *  할당된 공간을 byteNumber라고 부르겠다.
			 *  언언된 byteNumber 변수에 처음으로 127을 넣음
			 *  --> 초기화 : 처음 변수에 값을 대입
			 */
			System.out.println("byteNumber: " + byteNumber);
			
			short shortNumber = 32767; // 변수 선언 및 초기화 
			// 정수 자료형의 기본 int 
			int intNumber = 2147483647; // 변수 선언 및 초기화
			// 자료형(int) 변수명(intNumber) = 리터럴;
			// 프로그래밍에서는 대입 되는 테이터를 리터럴 이라는 단어로도 표현
			
			// **리터럴 : 변수에 대입되ㅏ거나 작성되는 값 자체
			// + 자료형에 따라 리터럴의 표기법이 다름
			
			long longNumber = 10000000000L; // 소문자 대문자 상관없이 롱을 쓸때는 L을 붙여준다
			//100억이라는 값은 범위를 벗어남
			// 뒤에 L을 붙여주어서 long 자료형인것을 나타냄
			
			//실수형
			float floatNumber = 1.2345f; // f를 붙여서 float형인 것을 나타내야함
			double doubleNumber = 3.141592;// 뒤에 d를 붙이지 않아도 된다(가능은 함)
			// 자바는 뒤에 아무것도 없으면 double로 인식
			
			//문자형 리터럴 표기법: '' -> 문자 하나 " " -> 문자 두개이상
			char ch = 'A'; // 유니코드 65
			char ch2 = 66; // 유니코드 B
			// char는 문자하나
			// string str은 문자 2개이상
			
			System.out.println("ch" + ch);
			System.out.println("ch2:" + ch2);
			
			/*
			 * char 자료형에 숫자가 대입될수 있는 이유
			 * 컴퓨터에는 문자표가 존재하고있다
			 * 숫자에 따라 지정된 문자 모양이 매핑되어있고
			 * 'B' 문자 그대로가 대입되면 변수에 숫자 66으로 변환되어 저장됨
			 * 반대로 생각하면 변수에 66을 저장이 가능하고 B로 인식된다. 
			 */
			
			//변수명의 규칙
			/* 1. 대소문자가 구분되면 길이 제한이 없다.
			 * 2. 예약어를 사용하면 안된다. Ex) true, final, string등등
			 * 3. 숫자로 시작할 수 없다.
			 * 4. 특수문자는 _ 와 $만 허용한다 (하지만 쓰지않는다)
			 * 5. 여러 단어 이름은 단어의 첫글자를 대문자로한다. 단 가장 처음 시작 글자는 소문자로 하는것이 관례(카멜표기법)
			 * Ex) userName, intNumber 
			 */
			int $intNumber;
			int int_number;// 자바에서는 카멜표기법을 쓰기에 쓰지않는다 _표기법은 DB에서 사용한다
			
			char animalCatDogElepant;
			
			//6. 변수명은 언어를 가리지않는다(하지만 영어만 사용)
			
			// -----------------------------------------------------------------
			
			
			int number = 10;
			System.out.println("number: " + number); //10
			
			number = 20;
			System.out.println("number: " + number); //20
			
			//변수라 넘버의 값이 바뀌는 것이 가능하다
			
			/* 상수( 항상 같은 수)
			 * -변수의 한 종류
			 * 한번 값이 대입되면 다른 값이 대입 될 수 없다
			 * -자료형 앞에 final 키워드를 작성한다(마지막 대입값이라는뜻)
			 * -상수 명명 규칙 : 모두 대문자, 여러단어 작성시 _를 사용한다
			 * -상수를 사용하는 경우
			 * 1) 변하면 안되는 고정된 값을 저장할 때
			 * 2) 특정한 값에 의미를 부여하는 경우 			
			 */
			
			final double PI_VALUE = 3.14;
	    //PI_VALUE = 2.3; 은 불가능
		}

}
