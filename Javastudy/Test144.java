/*================================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
  - Calendar Ŭ����
=================================================*/

// �� ������ �������� �Է¹޴� ��¥��ŭ ���� ��,��, ��, ������
//	  Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ���� ��¥ : 2023-9-19 ȭ����
// �� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

// ========[Ȯ�� ���]========
// 200�� �� : xxxx-xx-xx x����
// ===========================
// ����Ϸ��� �ƹ� Ű��...

// �� Calendar �� ������ API Document ����~!!!
//	  ��add()��
//	  : ���� ��¥�� �������� �� �� ���ϴ� ���� �޼ҵ�
//	    �� ����ü.add(Calendar.DATE, ����)��

import java.util.Scanner;
import java.util.Calendar;

public class Test144
{
	public static void main(String[] args)
	{	
		//Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// Calendar �ν��Ͻ� ����
		Calendar now = Calendar.getInstance();

		// �ֿ� ���� ����
		int nalsu;			//-- ����ڷκ��� �Է¹��� �� ��
		int y, m, d, w;		//-- ��, ��, ��, ����
		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};

		// ������ ��, ��, ��, ���� Ȯ��(�� �������� : get())
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;			//-- ��+1�� check~!!!
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		// ������ ��, ��, ��, ���� Ȯ�� ��� ���
		System.out.println("���� ��¥ : " + y + "-" + m + "-" + d + " " + week[w-1] + "����");

		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);

		// check~!!!
		now.add(Calendar.DATE, nalsu);


		// ��� ���
		System.out.println();
		System.out.println("========[Ȯ�� ���]========");
		System.out.printf("%d�� �� : %tF %tA\n", nalsu, now, now);
		System.out.println("===========================");

		// String.format("%tF", �޷°�ü);
		// �桺��-��-�ϡ� ������ ���ڿ� ��ȯ

		// String.format("%tA", �޷°�ü);
		// �� ���� ������ ���ڿ� ��ȯ




// ���� ���
/*
���� ��¥ : 2023-9-19 ȭ����
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

========[Ȯ�� ���]========
200�� �� : 2024-04-06 �����
===========================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
		







/* �� Ǯ��

		Calendar cal = Calendar.getInstance();

		int n;
		int p;

		int y, m, d, w;

		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);

		String week = "";
		switch (w)
		{
			case 1 : week = "�Ͽ���"; break;
			case 2 : week = "������"; break;
			case 3 : week = "ȭ����"; break;
			case 4 : week = "������"; break;
			case 5 : week = "�����"; break;
			case 6 : week = "�ݿ���"; break;
			case 7 : week = "�����"; break;
		}

		
		System.out.println("���� ��¥ : " + y + "-" + m + "-" + d + " " + week);

		System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
		n = sc.nextInt();

		cal.add(Calendar.DATE, n);

		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);

		
		switch (w)
		{
			case 1 : week = "�Ͽ���"; break;
			case 2 : week = "������"; break;
			case 3 : week = "ȭ����"; break;
			case 4 : week = "������"; break;
			case 5 : week = "�����"; break;
			case 6 : week = "�ݿ���"; break;
			case 7 : week = "�����"; break;
		}

		System.out.println("========[Ȯ�� ���]========");
		System.out.printf("%d�� �� : %d-%d-%d %s\n", n, y, m, d, week);
		System.out.println("===========================");

*/

		}
}