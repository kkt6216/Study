/*=======================================
  ���� Ŭ���� ��� ����
  - �������̽�(Interface)
=========================================*/

// �� �ǽ� ����
//	  ���� ó�� ���α׷��� �����Ѵ�.
//    ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է�(1~10) : 11
// �ο� �� �Է�(1~10) : 0
// �ο� �� �Է�(1~10) : 2

// 1��° �л��� �й� �̸� �Է� (���� ����) : 2309123 ��ٽ�
// ���� ���� ���� ���� �Է�    (���� ����) : 90 100 85
// 2��° �л��� �й� �̸� �Է� (���� ����) : 2309125 �赿��
// ���� ���� ���� ���� �Է�    (���� ����) : 85 70 60

// 2309123 ��ٽ�   90 100  85    xxx   xx.xx
//					��  ��  ��
// 2309125 �赿��   85  70  60   xxx   xx.xx
//					��  ��  ��

// ����Ϸ��� �ƹ� Ű�� ��������...

// 90�̻�		  �� ��
// 80�̻� 90 �̸� �� ��
// 70�̻� 80 �̸� �� ��
// 60�̻� 70 �̸� �� ��
// 60�̸� (�� ��) �� ��

// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ���  Ȱ��

import java.util.Scanner;


class Record
{
	String hak, name;		//-- �й�, �̸�
	int kor,  eng, mat;		//-- ����, ����, ���� ����
	int tot;				//-- ����
	double avg;				//-- ���
}

// �������̽�
interface Sungjuk
{
	public void set();		//-- �ο� ����
	public void input();	//-- ������ �Է�
	public void print();	//-- ��� ���
}

// ���� �ذ� �������� �����ؾ� �� Ŭ���� �� Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk
{
	Scanner sc = new Scanner(System.in);

	private int inwon;
	private Record[] rec;
	
	@Override
	public void set() 
	{
		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>10);
		System.out.println();

		rec = new Record[inwon];
	}
	
	@Override
	public void input()
	{
		for (int i=0; i<inwon; i++)
		{
			rec[i] = new Record();

			System.out.printf("%d��° �л��� �й� �̸� �Է� (���� ����) : ", i+1);
			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			System.out.print("���� ���� ���� ���� �Է�    (���� ����) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot / 3.0;
		}
		System.out.println();
	}

	 @Override
	 public void print()
	{
		 for (int i=0; i<rec.length; i++)
		 {
			 System.out.printf("%s %s %3d %3d %3d %4d %.2f\n", rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			 System.out.printf("%17s %2s %2s\n", panjung(rec[i].kor),panjung(rec[i].eng),panjung(rec[i].mat));
		 }
		 System.out.println();
		

	}

	// ���������� ��޿� ���� ������ ������ �޼ҵ�
	private String panjung(int score)
	{
		String result="";

		switch (score/10)
		{
		case 10:result="��"; break;
		case  9:result="��"; break;
		case  8:result="��"; break;
		case  7:result="��"; break;
		case  6:result="��"; break;
		case  5:result="��"; break;
		}
		return result;
	}
}

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test121
{
	public static void main(String[] args)
	{
		Sungjuk ob;

		// ���� �ذ� �������� �ۼ��ؾ� �� ob ���� �� ��ü ����
		ob = new SungjukImpl();
		
		ob.set();
		ob.input();
		ob.print();
	}
}

// ���� ���
/*
// ���� ��)
// �ο� �� �Է�(1~10) : 11
// �ο� �� �Է�(1~10) : 0
// �ο� �� �Է�(1~10) : 2

// 1��° �л��� �й� �̸� �Է� (���� ����) : 2309123 ��ٽ�
// ���� ���� ���� ���� �Է�    (���� ����) : 90 100 85
// 2��° �л��� �й� �̸� �Է� (���� ����) : 2309125 �赿��
// ���� ���� ���� ���� �Է�    (���� ����) : 85 70 60

// 2309123 ��ٽ�   90 100  85    xxx   xx.xx
//					��  ��  ��
// 2309125 �赿��   85  70  60   xxx   xx.xx
//					��  ��  ��

// ����Ϸ��� �ƹ� Ű�� ��������...
*/