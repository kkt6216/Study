/*=========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
  - if ��
  - if ~ else �� �ǽ�
  =========================================*/

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//	  �б� ������ ���ϱ� ���� ����ϴ� �������
//	  if��, if ~ else��, ���ǿ�����, ����if��(if�� ��ø), switch���� �ִ�.

// 2. if���� if ������ ������ ��(true)�� ���
//	  Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ Ȧ������, ¦������, ������ Ȯ���Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 14
// 14 �� ¦��
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 13
// 13 �� Ȧ��
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 13
// 0 �� ��
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;
		
		System.out.print("������ ���� �Է� :");
		n = Integer.parseInt(br.readLine());

		/*
		if (n%2==0)
		{
			System.out.pritln(n + "�� ¦��");
		}
		else if (n%2!=0)
		{
			System.out.pritln(n + "�� Ȧ��");
		}
		else
		{
			System.out.pritln(n + "�� ��");
		}
		*/

/*
		if (n%2==0)
		{
			System.out.pritln(n + "�� ¦��");
		}
		else if (n==0)
		{
			System.out.pritln(n + "�� ��");
		}
		else if (n%2!=0)
		{
			System.out.pritln(n + "�� Ȧ��");
		}
		*/



		String result = "�����Ұ�";

		if (n==0)
		{
			result = "��";
		}
		else if (n%2==0)
		{
			result = "¦��";
		}
		else if (n%2!=0)
		{
			result = "Ȧ��";
		}


		System.out.println(n + "��" + result);	





		/* ���� Ǯ���� ����
		int a;
		String b;

		System.out.print("������ ���� �Է� :");
		a = Integer.parseInt(br.readLine());

		
		if (a % 2 == 0 && a!=0)
		{
			b = "¦��";
		}
		else if (a % 2 != 0)
		{
			b = "Ȧ��";
		}
		else 
		{
			b = "��";
		}
		
		System.out.printf("%d �� %s\n", a, b);
		*/

	}
	
}