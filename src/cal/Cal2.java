package cal;

import java.util.Scanner;

public class Cal2 {
	
	private static final int MAX_DAYS[] = {31,28,31,30,31,30,31,31,30,31,30,31}; 
	
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	/* 
	 * 월을 입력하면 해당월의 달력을 출력한다.
	 * 달력 모양은  1단계에서 작성한 모양으로 만든다.
	 * 1일은 일요일로 정해도 무방하다
	 * -1을 입력받기 전까지 반복 입력 받는다.
	 * 프롬프트를 출력한다.
	 * */
	
	
	
	public static void main(String[] args) {
		
	}

}
