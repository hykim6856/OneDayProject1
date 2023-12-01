package com.callor.service;

import java.util.Scanner;

public class MiniGame {
	public static boolean Apple(){
		int rndN = (int)(Math.random()*5)+1;
		if (rndN==1) {
			return true;
		}
		return false;
	}
	
	public static void RSP() {
		int rnd = (int)(Math.random()*3)+1;
		Scanner scan = new Scanner(System.in);
		System.out.println("갑자기 나타난 꼬마가 가위바위보를 하자고 한다.");
		System.out.println("수락하시겠습니까? ( 예 / 아니오 )>>");
		String str = scan.nextLine();
		
			
		}
	}


