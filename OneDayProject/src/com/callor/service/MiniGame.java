package com.callor.service;

public class MiniGame {
	public static boolean Apple(){
		int rndN = (int)(Math.random()*5)+1;
		if (rndN==1) {
			return true;
		}
		return false;
	}

}
