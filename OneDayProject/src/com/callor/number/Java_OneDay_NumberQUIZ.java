package com.callor.number;

import java.util.Scanner;

import com.callor.service.Line;
import com.callor.service.MiniGame;

public class Java_OneDay_NumberQUIZ {


	public static void game() {
		int RANGE = 50;
		int life = 5;

		Scanner scan = new Scanner(System.in);
		int answer = (int) (Math.random() * RANGE) + 1;

		// -----------

		int num = 0;
		int tryN = 0;
		// ------------
		Line.sLine(50);
		System.out.printf("<<%d번 안에 1 부터 %d까지의 수중 황금열쇠를 맞춰보세요>>\n", life, RANGE);
		Line.sLine(50);

		// ======================================================
		while (true) {
			System.out.print("황금열쇠(QUIT 종료) >> ");
			String str = scan.nextLine();
			// ======================================================
			if (str.equals("QUIT")) {
				System.out.println("종료");
				break;
				// ======================================================
			}
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println();
				System.out.printf("<!!오류!!>\n (%s)를 입력하셨습니다. ", str);
				System.out.println("정수를 정확히 입력해주세요! ");
				System.out.println();
				Line.sLine(50);
				continue;
			}
//--
			if (num > RANGE || num < 1) {
				System.out.println();
				System.out.printf("<!!오류!!>\n %d 은 범위 안의 수가 아닙니다. 1부터 %d 까지의 정수를 입력해주세요! \n", num, RANGE);
				System.out.println();
				Line.sLine(50);
				continue;
			}
			if (life - tryN == 1 && num != answer) {
				System.out.println("남은 횟수 : " + 0);
				System.out.println("Gameover");
				System.out.println("정답 : " + answer);
				Line.dLine(50);
				break;
			}
			// ======================================================
			if (num > answer) {
				System.out.println();
				System.out.printf("!HINT! : 입력하신 %d 보다 작아요\n", num);
			} else if (num < answer) {
				System.out.println();
				System.out.printf("!HINT! : 입력하신 %d 보다 커요\n", num);
			} else {
				tryN += 1;
				System.out.printf("[ %d 번째 시도만에 클리어 ]\n", tryN);
				System.out.printf("정답은 %d!\n", num);
				System.out.println("축하합니다 황금열쇠를 찾으셨어요 :)");
				Line.sLine(50);
				break;
			}
			// ======================================================
			tryN += 1;
			System.out.printf("[ %d 번째 시도, 남은 횟수 : %d ]\n", tryN, life - tryN);
			System.out.println("다시 시도해보세요 :(");
			System.out.println();
			Line.sLine(50);
			if(MiniGame.Apple()) {
				Line.bLine(25);
				System.out.println("축하드립니다. 행운의 황금사과를 발견하셨습니다.\n 먹으니 기력이 솟아 횟수를 모두 회복합니다.");
				Line.bLine(25);
				tryN=0;
			}

			continue;
			// --
		} // end while

	}// end game

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
		Line.dLine(50);
		System.out.println("뤼팡의 황금열쇠를 찾아라");
		Line.dLine(50);
		game();
		System.out.println("재시작하시겠습니까?");
		System.out.print("(네/아니오) >> ");
		String regame = scan.nextLine();
		if (regame.equals("네")) {
			continue;
		
		}
		break;
	}
		System.out.println("종료");
}
}
