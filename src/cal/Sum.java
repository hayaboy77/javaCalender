package cal;

import java.util.Scanner;

public class Sum {
public static void main(String[] args) {
	//�Է� : Ű����� �� ���� �Է��� �޴´�.
	//��� : ȭ�鿡 �� ���� ���� ����Ѵ�.
	
	int a,b;
	
	Scanner scanner = new Scanner(System.in); 
	String s1, s2;
	
	System.out.println("�� ���� �Է����ּ���");
	s1=scanner.next();
	s2=scanner.next();
	System.out.println("�� ���� ����");
	
	System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
	
	//�Ϸ��� commit, push
}
}
