package com.callor.service;

public class Error {

	public static void error1(String str) {
		try {
			int num = Integer.valueOf(str);
		} catch (Exception e) {
			System.out.println();
			System.out.printf("<!!오류!!>\n (%s)를 입력하셨습니다. ", str);
			System.out.println("정수를 정확히 입력해주세요! ");
			System.out.println();
			System.out.println("-".repeat(50));
			return;
		}
	}
	public static void error2(int num, int range) {
		if (num > range || num < 1) {
			System.out.println();
			System.out.printf("<!!오류!!>\n %d 은 범위 안의 수가 아닙니다. 1부터 %d 까지의 정수를 입력해주세요! \n", num, range);
			System.out.println();
			System.out.println("-".repeat(50));
			return;
		}
	}
}
