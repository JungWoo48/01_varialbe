package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		// Scanner : 프로그램 실행중 키보드입력을 받을수 있게하는 역할
		
		// Scanner 생성
		// 프로그램안에 스캐너라는 기계를 만든것
		Scanner sc = new Scanner(System.in); // sc에 Scanner 기능을 저장시킨다는 뜻
		// import를 먼저 한후 실행가능
		// Scanner 설계도를 import 하면 해결
		
		//int input1 = sc.nextInt(); // 입력 받은 정수를 input1 에 대입	
		// nextInt() : 다음 입력된 정수를 읽어옴(밑에 있는 출력에서 키보드로 입력된것을 출력)
		//System.out.println(input1); //input에 대입한 값을 출력
		
		//System.out.print("실수를 입력");
		//double input2 = sc.nextDouble();
		//System.out.println(input2);
		//실수를 입력에 원하는 실수를 입력 int형이기 때문
		
		
		// 안녕을 입력하고싶다면
		System.out.print("입력1: ");
		String input3 = sc.nextLine();
		//next() : 다음 입력된 한 단어를 읽는다
		System.out.println(input3);
		//출력후 밑에 있는 입력 1에 원하는 단어를 치고 엔터
		//여러 단어를 띄어서 연속해서 쓰고싶다면 nextLine을 사용할것
		
		
		
		
	}

}
