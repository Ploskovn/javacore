/*
	������������������ ���������� ��������� ��������� if
	��������� ��������� ����� ��� "IfSample.java"
*/
class IfSample {
	public static void main(String args[]) {
		int x,y;
		
		x = 10;
		y = 20;
		
		if (x < y) System.out.println("x ������ Y");
		
		x = x * 2;
		if (x == y) System.out.println("x ������ ����� Y");
		
		x = x * 2;
		if (x > y) System.out.println("x ������ ������ y");
		
		//���� �������� �� ����� �� ���� ��������
		if (x == y) System.out.println("�� �� ������� �����");
	}
}