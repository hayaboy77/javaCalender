package cal;

import java.util.Scanner;

public class Cal2 {
	
	private static final int MAX_DAYS[] = {31,28,31,30,31,30,31,31,30,31,30,31}; 
	
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	/* 
	 * ���� �Է��ϸ� �ش���� �޷��� ����Ѵ�.
	 * �޷� �����  1�ܰ迡�� �ۼ��� ������� �����.
	 * 1���� �Ͽ��Ϸ� ���ص� �����ϴ�
	 * -1�� �Է¹ޱ� ������ �ݺ� �Է� �޴´�.
	 * ������Ʈ�� ����Ѵ�.
	 * */
		
	public static void main(String[] args) {
		
		System.out.println("�ش���� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		
		String month=sc.next();
       //int lastday[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		int month2 =Integer.parseInt(month);
		
		//System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.", month2, lastday[month2-1]);
		
		Cal2 c = new Cal2();
		c.getMaxDaysOfMonth(month2);
		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.", month2,c.getMaxDaysOfMonth(month2) );
		
		sc.close();
	}

}
