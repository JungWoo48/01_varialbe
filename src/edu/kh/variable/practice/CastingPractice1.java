package edu.kh.variable.practice;

public class CastingPractice1 {
	public static void main(String[] args) {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2);
		System.out.println((int)dNum);
		
		System.out.println(iNum2 * dNum);
		System.out.println((float)iNum1);
		
		System.out.println((double)iNum1 / (double)iNum2);
		System.out.println(dNum);
		
		System.out.println((int)fNum);
		System.out.println(iNum1 / (int)fNum);
		
		System.out.println(iNum1 / fNum);
		System.out.println((double)iNum1 / fNum);
		
		System.out.println("'" + ch + "'");
		System.out.println((int)ch);
		System.out.println((int)ch + iNum1);
		System.out.println("'" + (char)((int)ch + iNum1));
		
		
	}

}
