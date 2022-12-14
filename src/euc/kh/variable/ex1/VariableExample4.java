package euc.kh.variable.ex1;

public class VariableExample4 {
		public static void main(String[] args) {
			/*
			 * 강제 형변환
			 * 기존 자료형을 원하는 자료형으로 강제 변환시킨다
			 * 
			 * 1) 값의 범위가 큰 자료형을 작은 자료형으로 변환
			 * 2) 출력되는 데이터의 표기법을 변화시키고 싶을 때
			 * 
			 * *강제 형변환 방법
			 * - 자료형을 변환시키고 싶은 값 또는 변수 앞에 (저료형)을 작성
			 * 
			 * Ex) double temp = 3.14;
			 * 	   int num = (int)temp;
			 */
			
			double temp = 3.14;
			int num = (int)temp;
			
			System.out.println("temp: " + temp); //3.14
			System.out.println("num: " + num); // 3
			// 실수에서 정수로 변환시 소수점은 버린다(데이터 손실떄문)
		
		}

}
		
